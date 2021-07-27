package com.yuravashchenko.springsecurityapp.service;

import com.yuravashchenko.springsecurityapp.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
