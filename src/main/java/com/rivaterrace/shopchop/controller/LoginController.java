package com.rivaterrace.shopchop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rivaterrace.shopchop.model.LoginModel;

@Controller
public class LoginController {
	public static final String BASE = "/login";

	@GetMapping(BASE)
	public String loginPage(Model model) {
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	}

	@PostMapping(BASE)
	public String loginSubmit(@ModelAttribute LoginModel loginModel) {
		return "redirect:/login";
	}
}
