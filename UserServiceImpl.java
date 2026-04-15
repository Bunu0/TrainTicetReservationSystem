package com.techm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techm.entity.User;
//import com.techm.entity.UserRole;
import com.techm.repository.UserRepository;
import com.techm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    @Override
    public boolean validateUser(String email, String password) {
        // Retrieve user by email from the database
        User user = userRepository.findByEmail(email);

        // Check if a user with the provided email exists
        if (user != null) {
            // Check if the provided password matches the user's password
            if (user.getPassword().equals(password)) {
                // Passwords match, return true to indicate successful authentication
                return true;
            }
        }

        // Either the user doesn't exist or the password is incorrect
        // Return false to indicate failed authentication
        return false;
    }

//    @Override
//    public List<User> getUsersByRole(UserRole role) {
//        return userRepository.findByRole(role);
//    }

}

