package com.xml.controller;

import java.util.Collections;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.Valid;
import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xml.dto.LoginDTO;
import com.xml.dto.RegisterUserDTO;
import com.xml.repository.RoleRepository;
import com.xml.service.UserService;
import com.xml.user.JwtToken;
import com.xml.user.Role;
import com.xml.user.RoleEnum;
import com.xml.user.User;










@Controller
@RequestMapping("/auth")
public class UserController {
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	public static final Pattern PASSWORD_REGEX_CHAR = 
		    Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$");
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtToken token;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private RoleRepository roleRepository;	
	
	@PostMapping(value ="/loginUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> loginUser(@Valid @RequestBody LoginDTO login) {
		logger.info("Korisnik: " +  login.getEmail() + " se prijavljuje na sistem");
		User user = userService.findByEmail(login.getEmail());

		if (user.getRole().getRole().equals(RoleEnum.USER)) {
			Authentication authentication = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(login.getEmail(), login.getPassword()));

			SecurityContextHolder.getContext().setAuthentication(authentication);
			logger.info("Korisnik: " +  login.getEmail() + " ulogovan");
			String jwt = token.generateToken(authentication);
			return new ResponseEntity<>(Collections.singletonMap("response", jwt),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
	}
	
	@PostMapping("/loginAdmin")
	public ResponseEntity<?> loginAdmin(@Valid @RequestBody LoginDTO login) {
		logger.info("Admin: " +  login.getEmail() + " se prijavljuje na sistem");
		User user = userService.findByEmail(login.getEmail());

		if (user.getRole().getRole().equals(RoleEnum.ADMIN)) {
			Authentication authentication = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(login.getEmail(), login.getPassword()));

			SecurityContextHolder.getContext().setAuthentication(authentication);
			logger.info("Admin: " +  login.getEmail() + " ulogovan");
			String jwt = token.generateToken(authentication);
			return new ResponseEntity<String>(HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
	}
	
	@PostMapping("/logout")
	public ResponseEntity<?> logOut(){
		logger.info("Korisnik: " +  SecurityContextHolder.getContext().getAuthentication().getName() + " izlogovan");
		SecurityContextHolder.getContext().setAuthentication(null);	
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	
	@PostMapping("/registerUser")
	public ResponseEntity<?> registerUser(@Valid @RequestBody RegisterUserDTO registration) {
		if(registration.getIme().trim().equals("") == false &&
				registration.getPrezime().trim().equals("") == false &&
				registration.getEmail().trim().equals("") == false &&
				validateMail(registration.getEmail())&&
				validatePassword(registration.getPassword())){
		if (userService.findByEmail(registration.getEmail()) != null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		User user = new User();
		user.setEmail(registration.getEmail());
		user.setIme(registration.getIme());
		user.setPrezime(registration.getPrezime());
		user.setPassword(passwordEncoder.encode(registration.getPassword()));
		
		Role role = roleRepository.findByRole(RoleEnum.USER);
		user.setRole(role);
		userService.save(user);
		logger.info("Korisnik: " +  registration.getEmail() + " registrovan");
		return new ResponseEntity<>(HttpStatus.OK);
		}else 
			System.out.println("Validacija neuspesna");
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping("/registerAgent")
	public ResponseEntity<?> registerAgent(@Valid @RequestBody RegisterUserDTO registration) {
		String token = UUID.randomUUID().toString().substring(0, 8);
				
		User user = new User();
		user.setEmail(registration.getEmail());
		user.setIme(registration.getIme());
		user.setPrezime(registration.getPrezime());
		user.setPassword(passwordEncoder.encode(registration.getPassword()));
		
		Role role = roleRepository.findByRole(RoleEnum.AGENT);
		user.setRole(role);
		userService.save(user);
		logger.info("Agent: " +  registration.getEmail() + " registrovan");
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	public static boolean validateMail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
	}
	public boolean validatePassword(String password) {
		if(password.length() < 8) {return false;}
		Matcher matcher = PASSWORD_REGEX_CHAR .matcher(password);
        return matcher.find();
		
	}
	

}
