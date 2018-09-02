package agentapp.controller;

import java.net.MalformedURLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import agentapp.domain.SmestajSoap;
import agentapp.dto.SmestajDto;
import agentapp.service.SoapSmestajService;
import agentapp.service.SoapUserService;
import https.bezbednost.User;



@Controller
public class SmestajController {
	
	@Autowired
	private SoapUserService soapUserService;
	
	@Autowired
	private SoapSmestajService smestajService;
	
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", value = "/create" )
	public ResponseEntity<Long> create(@RequestBody SmestajDto smestaj) throws MalformedURLException{
		SmestajSoap newAccSoap = smestajService.save(smestaj,smestaj.getAgent());
		return new ResponseEntity<>(newAccSoap.getId(), HttpStatus.OK);		
	}
	

}
