package com.xml.service.soap;

import javax.jws.WebService;
import javax.transaction.Transactional;

import com.xml.user.User;


@WebService(targetNamespace="https://bezbednost/")
public interface UserServiceSoap {
	
	public User findOne(Long id);
	public User verifyAgentLogin(String username);

}
