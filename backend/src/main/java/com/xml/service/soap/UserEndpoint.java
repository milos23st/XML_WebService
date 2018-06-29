package com.xml.service.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.xml.repository.UserRepository;

@Endpoint
public class UserEndpoint {
	
	/*private static final String NAMESPACE_URI = "https://bezbednost";

	private UserRepository userRepository;

	@Autowired
	public UserEndpoint(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUser")
	@ResponsePayload
	public FindOneResponse getCountry(@RequestPayload FindOne request) {
		FindOneResponse response = new FindOneResponse();
		response.setReturn(userRepository.getOne(request.getArg0()));

		return response;
	}
}*/

}
