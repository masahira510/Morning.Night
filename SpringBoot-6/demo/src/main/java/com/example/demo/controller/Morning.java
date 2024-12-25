package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.MorningService;

@Controller
public class Morning {
	
	@Autowired
	private MorningService morningService;
	
	@GetMapping("/morning")
	public String index(Model model) {
		String message = morningService.getMorningMessage();
		model.addAttribute("message", message);
		return "hello";
	}

}
