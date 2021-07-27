package com.yuravashchenko.springsecurityapp.dao;

import com.yuravashchenko.springsecurityapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
