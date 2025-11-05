package com.portal_exam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_role")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userRoleId;

    //user
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    //role
    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;

    public UserRole(){}

    public Long getUserRoleId() {
        return userRoleId;
    }  
    public User getUser() {
        return user;
    }
    public Role getRole() {
        return role;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setRole(Role role) {
        this.role = role;
    }

}
