package com.backpackaviation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FrontController {
	@GetMapping("/pilot/{id}")
	String getPilotDetails(Model model, @PathVariable Integer id)
	{
		model.addAttribute("pilotId", id);
		return "pilotDetails";
	}

}
