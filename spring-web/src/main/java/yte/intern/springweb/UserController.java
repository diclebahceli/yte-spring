package yte.intern.springweb;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class UserController{

    @PostMapping("/user")
    public User addUser(@Valid @RequestBody User user){
        System.out.println(user);
        return user;
    }
}