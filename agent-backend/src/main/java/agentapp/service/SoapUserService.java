package agentapp.service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.springframework.stereotype.Component;

import https.bezbednost.User;
import https.bezbednost.UserService;
import https.bezbednost.UserServiceSoap;

@Component
public class SoapUserService {
	
	public User findOne(Long id) throws MalformedURLException{		
		URL url = new URL("http://localhost:8081/Service/userServiceSoap?wsdl");
		QName qname = new QName("https://bezbednost/", "UserService");
		Service service = Service.create(url, qname);
		UserServiceSoap userServiceSoap = service.getPort(UserServiceSoap.class);
		
		return userServiceSoap.findOne(id);
	
	}
	
	public User verifyAgentLogin(String username) throws MalformedURLException {
		
		URL url = new URL("http://localhost:8081/Service/userServiceSoap?wsdl");
		QName qname = new QName("https://bezbednost/", "UserService");
		Service service = Service.create(url, qname);
		UserServiceSoap userServiceSoap = service.getPort(UserServiceSoap.class);
		

		return userServiceSoap.verifyAgentLogin(username);
	}

}
