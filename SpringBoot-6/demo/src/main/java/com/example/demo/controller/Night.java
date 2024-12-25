package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.NightService;

@Controller
public class Night {
	
	@Autowired
	private NightService nightService;
	
	@GetMapping("/night")
	public String index(Model model) {
		String message = nightService.getNightMessage();
		model.addAttribute("message", message);
		return "hello";
	}
}
