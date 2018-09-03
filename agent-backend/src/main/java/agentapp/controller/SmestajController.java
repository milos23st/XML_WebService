package agentapp.controller;

import java.net.MalformedURLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import agentapp.domain.SmestajSoap;
import agentapp.dto.AgentDTO;
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
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", value = "/login")
	public ResponseEntity<User> login(@RequestBody AgentDTO agentDTO) throws MalformedURLException {	
		
		User user = soapUserService.verifyAgentLogin(agentDTO.getUsername());
		
		if(user == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		else if(user.getRole().getId()!=3){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.SET_COOKIE, "Id="+user.getId());
		return new ResponseEntity<>(user,headers,HttpStatus.OK);
	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET )
	public ResponseEntity<User> logout() {
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.SET_COOKIE, null);
		return new ResponseEntity<>(headers, HttpStatus.OK);
	}
	

}
