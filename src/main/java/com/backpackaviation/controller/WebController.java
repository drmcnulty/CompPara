package com.backpackaviation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backpackaviation.interfaces.PilotRepository;
import com.backpackaviation.roles.Pilot;
import com.backpackaviation.roles.View;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
@RequestMapping("api")
public class WebController {
	
	@Autowired
	private PilotRepository pilotRepository;
	
	public WebController( PilotRepository pilotRepository) {
		this.pilotRepository = pilotRepository;
	}
	
	/**
	 * Add a pilot to the pilot repository
	 * 
	 * @param Pilot
	 * @return the new Pilot object created
	 */
	@PostMapping(path="/pilots")
	public Pilot addPilot(@RequestBody Pilot pilot) {
		return pilotRepository.save(pilot);
	}
	
	/**
	 * retrieve all the pilots in the repository, each in full detail
	 * 
	 * @return Iterable list of pilots
	 */
	@GetMapping(path="/pilots")
	public Iterable<Pilot> listPilots() {
		// This returns a JSON or XML with the users
		return pilotRepository.findAll();
	}
	
	@GetMapping(path="/pilot/{id}")
	public Optional<Pilot> getPilot(@PathVariable Integer id) {
		// This returns a JSON or XML with the users
		return pilotRepository.findById(id);
	}	
	
	/**
	 * retrieve summaries of all the pilots in the repository
	 * (so the pilot objects returned at the http endpoint are not full detail
	 *  pilot objects in JSON, they are just a few fields. See documentation
	 *  for "\@JsonView") 
	 * @return
	 */
	@JsonView(View.Summary.class)
	@GetMapping(path="/statusList")
	public Iterable<Pilot> listAllPilotStatus() {
		return pilotRepository.findAll();
	}
}
