package com.xml.service.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.transaction.Transactional;
import javax.xml.ws.ResponseWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.repository.UserRepository;
import com.xml.service.UserService;
import com.xml.user.User;

@Service
@WebService(targetNamespace="https://bezbednost/", serviceName="UserService", endpointInterface="com.xml.service.soap.UserServiceSoap")
public class UserServiceSoapImpl implements UserServiceSoap {

	@Autowired
	UserRepository userRepository;

	@Override
	@Transactional
	public User findOne(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public User verifyAgentLogin(String username) {
		return userRepository.findByEmail(username);
	}
	
	
}
