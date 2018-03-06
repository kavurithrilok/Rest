package com.smydata.registration.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smydata.registration.model.Registartion;
import com.smydata.registration.repository.RegistrationRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	RegistrationRepository registrationRepository;

	@Override
	public Registartion saveUser(Registartion registration) {
		
		return registrationRepository.save(registration);
		
	}
	

}
