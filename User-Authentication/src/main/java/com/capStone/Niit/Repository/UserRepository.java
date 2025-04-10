package com.capStone.Niit.Repository;

import com.capStone.Niit.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    public abstract User findByEmailIdAndPassword(String emailId, String password);
}
