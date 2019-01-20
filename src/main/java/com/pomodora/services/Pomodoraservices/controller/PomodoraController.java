package com.pomodora.services.Pomodoraservices.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pomodora.services.Pomodoraservices.beans.SignupFormBean;
import com.pomodora.services.Pomodoraservices.beans.SignupRepository;

@RestController
@RequestMapping(value = "/")
public class PomodoraController {

	private final SignupRepository signupRepository;

	public PomodoraController(SignupRepository signupRepository) {
		this.signupRepository = signupRepository;

	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<SignupFormBean> getAllUsers() {
		// LOG.info("Getting all users.");
		return signupRepository.findAll();
	}
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public Optional<SignupFormBean> getUser(@PathVariable String userId) {
		// LOG.info("Getting user with ID: {}.", userId);
		return signupRepository.findById(userId);
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public SignupFormBean addNewUsers(@RequestBody SignupFormBean user) {
		// LOG.info("Saving user.");

		return signupRepository.save(user);
	}
	
}
