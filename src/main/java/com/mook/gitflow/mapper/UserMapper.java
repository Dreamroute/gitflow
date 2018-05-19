package com.mook.gitflow.mapper;

import com.mook.gitflow.domain.User;

public interface UserMapper {

    int insert(User user);

    User select(Long id);

}
