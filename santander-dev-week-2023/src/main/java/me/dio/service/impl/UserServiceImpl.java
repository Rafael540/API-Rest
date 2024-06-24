package me.dio.service.impl;

import java.util.*;

import org.springframework.stereotype.Service;

import me.dio.domain.model.User;
import me.dio.domain.repository.*;
import me.dio.service.*;

@Service
public class UserServiceImpl implements UserService{
	
	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
		if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
			throw new IllegalArgumentException("This user Accont Number already exists.");
		}
		return userRepository.save(userToCreate);
	}
	
}
