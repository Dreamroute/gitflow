package com.mook.gitflow.service;

import com.mook.gitflow.domain.User;

public interface UserService {

    int insert(User user);
    
    User select(Long id);
    
}
