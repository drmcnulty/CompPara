package com.backpackaviation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backpackaviation.interfaces.PilotRepository;
import com.backpackaviation.roles.Pilot;

@RestController
public class WebController {
	@Autowired
	private PilotRepository pilotRepository;
	
	@PostMapping(path="/addPilot")
	public Pilot addPilot(@RequestBody Pilot pilot) {
		return pilotRepository.save(pilot);
	}
	
	@GetMapping(path="/listPilots")
	public @ResponseBody Iterable<Pilot> listPilots() {
		// This returns a JSON or XML with the users
		return pilotRepository.findAll();
	}
//	@PostMapping(path="/setPilotState")
//	public CompMessage setPilotState(@RequestBody Integer pilotNumber, @RequestBody PilotState pilotState) {
//		return messageRepository.save(new CompMessage(pilotNumber, pilotState));
//	}
}
