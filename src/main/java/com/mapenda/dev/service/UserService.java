package com.mapenda.dev.service;

import com.mapenda.dev.dto.UserRegistrationDto;
import com.mapenda.dev.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
