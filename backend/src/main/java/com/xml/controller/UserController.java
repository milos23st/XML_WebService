package com.xml.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xml.dto.LoginDTO;
import com.xml.service.UserService;
import com.xml.user.JwtToken;
import com.xml.user.RoleEnum;
import com.xml.user.User;






@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtToken token;
	
	@RequestMapping(method = RequestMethod.POST,value = "/registerUser")
	public ResponseEntity<?> registerUser(@RequestBody User user) {
		
		if(userService.findByEmail(user.getEmail()) == null) {
			User newUser = userService.save(user);
			System.out.println("sacuvan");
			return new ResponseEntity<User>(newUser, HttpStatus.OK);
		}
		else return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);		
	}
	
	@RequestMapping("/loginUser")
	public ResponseEntity<?> loginUser(@RequestBody LoginDTO login) {

		User user = userService.findByEmail(login.getEmail());

		if (user.getRole().getRole().equals(RoleEnum.USER)) {
			Authentication authentication = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(login.getEmail(), login.getPassword()));

			SecurityContextHolder.getContext().setAuthentication(authentication);

			String jwt = token.generateToken(authentication);
			return new ResponseEntity<String>(jwt,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
	}
	

}
