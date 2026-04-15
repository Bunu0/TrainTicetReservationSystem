package com.techm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/admin")
public class AdminController {

    // Mapping for admin login page
    @GetMapping("/login")
    public String showLoginForm() {
        return "admin/login"; //  admin login page exists at /WEB-INF/jsp/admin/login.jsp
    }

    // Handling admin login form submission
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes) {
        // Implement your login logic here
        // For simplicity, let's assume a hardcoded admin username and password
        if ("admin".equals(username) && "admin".equals(password)) {
            // Redirect to admin dashboard upon successful login
            return "redirect:/admin/dashboard";
        } else {
            // If login fails, redirect back to the login page with an error message
            redirectAttributes.addFlashAttribute("error", "Invalid username or password");
            return "redirect:/admin/login";
        }
    }

    // Mapping for admin dashboard page
    @GetMapping("/dashboard")
    public String showDashboard() {
        return "admin/admindashboard"; // Assuming admin dashboard page exists at /WEB-INF/jsp/admin/dashboard.jsp
    }

    // Mapping for logout
    @GetMapping("/logout")
    public String logout() {
        // Implement logout logic if required
        // For simplicity, we're just redirecting to the login page
        return "redirect:/admin/login";
    }
}

