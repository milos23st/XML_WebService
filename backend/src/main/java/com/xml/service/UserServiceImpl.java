package com.xml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.repository.UserRepository;
import com.xml.user.User;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User findByEmail(String email) {
		User user = userRepository.findByEmail(email);
		return user;
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findOne(Long id) {
		return userRepository.getOne(id);
	}

}
