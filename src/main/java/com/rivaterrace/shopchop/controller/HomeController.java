package com.rivaterrace.shopchop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	public final static String BASE = "/";
	
	@GetMapping(BASE)
	public String homepage() {
		return "home";
	}
}
