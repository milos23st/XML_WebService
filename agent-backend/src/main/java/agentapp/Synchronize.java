package agentapp;

import java.net.MalformedURLException;
import java.text.ParseException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import agentapp.service.SoapSmestajService;

@Component
public class Synchronize {
	
	@Autowired
	private SoapSmestajService service;
	
	@PostConstruct
	private void sync() throws MalformedURLException, ParseException {
		service.synchonise();
	}

}
