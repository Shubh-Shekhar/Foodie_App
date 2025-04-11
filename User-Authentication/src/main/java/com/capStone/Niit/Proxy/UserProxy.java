package com.capStone.Niit.Proxy;

import com.capStone.Niit.Entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Favourite-Service", url = "localhost:8082")
public interface UserProxy {
    @PostMapping("/foodieApp/userService/addUser")
    public ResponseEntity<?> addUser(@RequestBody User user);
}