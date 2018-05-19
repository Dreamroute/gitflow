package com.mook.gitflow.controller;

import com.mook.gitflow.domain.User;
import com.mook.gitflow.service.UserService;

public class UserController {
    
    private UserService userService;

    public String insert(User user) {
        System.err.println(userService);
        return "insert user.";
    }
    
    public String select(Long id) {
        System.err.println("select user by id, id: " + id);
        return "select user by Id, id: " + id;
    }
    
}
