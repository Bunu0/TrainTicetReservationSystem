package com.techm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techm.entity.User;
//import com.techm.entity.UserRole;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
    User findByUsername(String username);
    
    User findByEmail(String email);
    
   // List<User> findByRole(UserRole role);
}

