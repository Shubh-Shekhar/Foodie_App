package com.capStone.Niit.Service;

import com.capStone.Niit.Entity.User;

import java.util.Map;

public interface SecurityTokenGenerator {
    public abstract Map<String, String> generateToken(User user);
}
