package com.techm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techm.entity.User;

import com.techm.service.UserService;

@Controller
@RequestMapping("/customer")
public class UserController {

    @Autowired
    private UserService userService;

    // Mapping for register page
    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "customer/register";
    }

    // Mapping to handle user registration
    @PostMapping("/register")
    public String useRegister(@ModelAttribute User user, BindingResult result) {
        if (result.hasErrors()) {
            return "customer/register"; // Return to registration form if there are errors
        }
        
        // Set default role to "customer"
        user.setRole("customer");
        
        userService.registerUser(user);
        return "redirect:/customer/login"; // Redirect to login page after registration
    }
    
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "customer/login"; // Assuming login.jsp exists in your views directory
    }

    // Mapping to handle user login
    @PostMapping("/login")
    public String loginUser(@ModelAttribute User user, Model model) {
        // Validate user credentials
        boolean isValidUser = userService.validateUser(user.getEmail(), user.getPassword());
        
        if (isValidUser) {
            // User authenticated, redirect to dashboard or home page
            return "redirect:/customer/dashboard" ; // Assuming dashboard page exists
        } else {
            // Invalid credentials, show login form with error message
            model.addAttribute("error", "Invalid email or password");
            return "customer/login"; // Show login page again
        }
    }
    
    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        // Add logic to populate model attributes if needed
        return "customerdashboard"; // Assuming the JSP file is named customerdashboard.jsp
    }
    
    @GetMapping("/logout")
    public String logoutUser() {
    	return "redirect:/home";
    }

    
}

