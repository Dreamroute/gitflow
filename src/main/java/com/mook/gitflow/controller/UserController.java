package com.mook.gitflow.controller;

import com.mook.gitflow.domain.User;
import com.mook.gitflow.service.UserService;

public class UserController {
    
    private UserService userService;

    public String insert(User user) {
        System.err.println(userService);
        return "insert user.";
    }
    
    public void select(Long id) {
        System.err.println("select user by id, id: " + id);
        System.err.println("fix bug.");
        System.err.println("select user by Id, id: " + id);
    }
    
}
