package com.rivaterrace.shopchop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rivaterrace.shopchop.dto.RegistrationDTO;
import com.rivaterrace.shopchop.service.UserService;

@Controller
public class RegistrationController {
	public static final String BASE = "/user/registration";

	@Autowired
	private UserService userService;

	@GetMapping(BASE)
	public String showRegistrationForm(Model model) {
		model.addAttribute("registrationDto", new RegistrationDTO());
		return "registration";
	}

	@PostMapping(BASE)
	public String submitRegistrationFormToCreateUser(@ModelAttribute @Valid RegistrationDTO registrationDto) {

		// TODO: finish implementation
//		try {
//			User user = userService.registerNewUserAccount(registrationDto);
//		} catch (UserAlreadyExistsException userAlreadyExistsException) {
//			
//		}
		return "redirect:" + BASE;
	}
}
