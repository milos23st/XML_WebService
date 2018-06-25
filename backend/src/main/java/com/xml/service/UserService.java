package com.xml.service;

import com.xml.user.User;

public interface UserService {
	
	public User findByEmail(String email);
	
	public User save(User user);

}
