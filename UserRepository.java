package com.dev.spring.security.jwt.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.spring.security.jwt.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
 
	Optional<User> findByUsername(String username);
}