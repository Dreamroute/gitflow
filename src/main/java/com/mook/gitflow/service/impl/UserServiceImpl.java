package com.mook.gitflow.service.impl;

import com.mook.gitflow.domain.User;
import com.mook.gitflow.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public int insert(User user) {
        System.err.println("insert user, user: " + user);
        return 0;
    }

    @Override
    public User select(Long id) {
        System.err.println("select user by id, id: " + id);
        return null;
    }

}
