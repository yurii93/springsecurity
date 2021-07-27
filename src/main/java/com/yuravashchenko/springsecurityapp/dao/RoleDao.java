package com.yuravashchenko.springsecurityapp.dao;

import com.yuravashchenko.springsecurityapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
