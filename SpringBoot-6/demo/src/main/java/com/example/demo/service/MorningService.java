package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MorningService {
	public String getMorningMessage() {
		return "Good morning!";
	}
}
