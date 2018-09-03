package com.xml.service;

import java.util.List;

import com.xml.user.User;



public interface UserService {
	
	public User findOne(Long id);
	
	public User findByEmail(String email);
	
	public User save(User user);
	
	public List<User> findAll();
	
	public void delete(Long id);
	
	User activateDeactivate(User korisnik) throws Exception;

}
