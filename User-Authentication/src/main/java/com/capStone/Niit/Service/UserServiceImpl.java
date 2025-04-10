package com.capStone.Niit.Service;

import com.capStone.Niit.Entity.User;
import com.capStone.Niit.Exception.UserAlreadyExistException;
import com.capStone.Niit.Exception.UserNotFoundException;
import com.capStone.Niit.Proxy.UserProxy;
import com.capStone.Niit.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserProxy userProxy;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserProxy userProxy){
        this.userRepository = userRepository;
        this.userProxy = userProxy;
    }

    @Override
    public User addUser(User user) throws UserAlreadyExistException {
        if (userRepository.findById(user.getEmailId()).isEmpty()){
            //insert record into mysql database
            User result = userRepository.save(user);

            user.setPassword("");
            user.setConfirmPassword("");

            //calling favouriteService addUser() , inserts records into favouriteService also
            ResponseEntity response = userProxy.addUser(user);

            System.out.println("Response : "+response.getBody());
            return result;
        }
        else {
            throw new UserAlreadyExistException();
        }
    }

    public User authenticationUser(String emailId, String password) throws UserNotFoundException
    {
        User user = userRepository.findByEmailIdAndPassword(emailId,password);
        if (user !=null)
        {
            return user;
        }
        else {
            throw new UserNotFoundException();
        }
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
