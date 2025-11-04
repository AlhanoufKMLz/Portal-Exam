package com.portal_exam.service;

import java.util.Set;

import com.portal_exam.entity.User;
import com.portal_exam.entity.UserRole;

public interface UserService {
    
    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
}
