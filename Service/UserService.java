package com.techm.service;

import java.util.List;

import com.techm.entity.User;
//import com.techm.entity.UserRole;


public interface UserService {
	
    User registerUser(User user);
    
    User getUserByUsername(String username);
    
    User getUserByEmail(String email);
    boolean validateUser(String email, String password);
    
   //List<User> getUsersByRole(UserRole role);
  
}

