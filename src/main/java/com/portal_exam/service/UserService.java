package com.portal_exam.service;

import java.util.Set;

import com.portal_exam.entity.User;
import com.portal_exam.entity.UserRole;

public interface UserService {
    
    //creat user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by username
    public User getUser(String username);

    //delete user by id
    public void deleteUser(Long userId);
}
