package com.smydata.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smydata.registration.model.Registartion;
import com.smydata.registration.service.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;

	@PostMapping("/saveUser")
	public Registartion saveUser(@RequestBody Registartion registration) {
		System.out.println("mobile"+registration.getMobile());
		return registrationService.saveUser(registration);
	}
	
	

}
