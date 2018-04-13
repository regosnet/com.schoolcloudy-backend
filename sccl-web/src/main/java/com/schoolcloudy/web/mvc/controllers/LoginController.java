package com.schoolcloudy.web.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import com.schoolcloudy.model.shared.entities.Credential;
import com.schoolcloudy.model.shared.entities.User;
import com.schoolcloudy.service.administrative.AdministrativeService;


@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private AdministrativeService administrativeService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="//check-get-user-by/credential", method = RequestMethod.POST)
	public ResponseEntity<User> getUser(@RequestBody Credential userCredential, UriComponentsBuilder builder) {
		User user = administrativeService.getUser(userCredential.getUsername(), userCredential.getPassword());
		if(user == null) {
			return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<User>(user, HttpStatus.ACCEPTED);
	}
}
