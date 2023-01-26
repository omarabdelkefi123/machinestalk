package com.machinestalk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.machinestalk.entities.UserMachinestalk;
import com.machinestalk.services.UserMachinestalkService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class UserMachinestalkController {

	@Autowired
	private UserMachinestalkService userMachinestalkservice;

	@PostMapping("/user-machinestalk/save")
	public void saveUsers(@RequestBody List<UserMachinestalk> users) {
		userMachinestalkservice.saveUsers(users);
	}

	// Get All UserMachinestalks
	@GetMapping("/user-machinestal/liste")
	public List<UserMachinestalk> getUserMachinestalks() throws JsonProcessingException {
		return userMachinestalkservice.getUserMachinestalks();
	}

}
