package com.rivaterrace.shopchop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rivaterrace.shopchop.dto.RegistrationDTO;

@Controller
public class RegistrationController {
	public static final String BASE = "/user/registration";

	@GetMapping(BASE)
	public String showRegistrationForm(Model model) {
		model.addAttribute("registrationDto", new RegistrationDTO());
		return "registration";
	}

	@PostMapping(BASE)
	public String submitRegistrationForm(@ModelAttribute RegistrationDTO registrationDto) {
		return "redirect:" + BASE;
	}
}
