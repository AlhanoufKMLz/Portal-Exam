package com.portal_exam.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal_exam.entity.User;
import com.portal_exam.entity.UserRole;
import com.portal_exam.repo.RoleRepository;
import com.portal_exam.repo.UserRepository;
import com.portal_exam.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;


    //creat user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User local = this.userRepository.findByUsername(user.getUsername());
        if(local!=null){
            System.out.println("User is already there!!");
            throw new Exception("User is already present!!");
        } else {
            //create user
            for(UserRole ur:userRoles){
                roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);
        }
        return local;
    }


    //get user by username
    @Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }

    //delete user by id
    public void deleteUser(Long userId){
        this.userRepository.deleteById(userId);
    }



}
