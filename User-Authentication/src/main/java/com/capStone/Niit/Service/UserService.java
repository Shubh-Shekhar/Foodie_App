package com.capStone.Niit.Service;


import com.capStone.Niit.Entity.User;
import com.capStone.Niit.Exception.UserAlreadyExistException;
import com.capStone.Niit.Exception.UserNotFoundException;

import java.util.List;

public interface UserService {
    public abstract User addUser(User user) throws UserAlreadyExistException;

    public abstract User authenticationUser(String emailId, String password) throws UserNotFoundException;

    public abstract List<User> getAllUsers();
}