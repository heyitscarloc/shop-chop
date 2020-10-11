package com.rivaterrace.shopchop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rivaterrace.shopchop.dto.LoginDTO;

@Controller
public class LoginController {
	public static final String BASE = "/user/login";

	@GetMapping(BASE)
	public String showLoginForm(Model model) {
		model.addAttribute("loginModel", new LoginDTO());
		return "login";
	}

	@PostMapping(BASE)
	public String submitLoginForm(@ModelAttribute LoginDTO loginDto) {
		return "redirect:/login";
	}
}
