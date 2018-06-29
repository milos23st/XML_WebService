package com.xml.service.soap;

import javax.jws.WebService;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.repository.UserRepository;
import com.xml.service.UserService;
import com.xml.user.User;

@Service
@WebService(targetNamespace="https://bezbednost/", serviceName="UserService", endpointInterface="com.xml.service.soap.UserServiceSoap")
public class UserServiceSoapImpl implements UserServiceSoap {

	@Autowired
	UserService userService;

	@Override
	public User findOne(Long id) {
		User user = userService.findOne(id);
		return user;
	}
	
	
}
