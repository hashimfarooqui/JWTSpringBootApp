package com.dev.spring.security.jwt.entity;

import lombok.Data;

@Data
public class UserRequest {

	private String username;	
	private String password;
}