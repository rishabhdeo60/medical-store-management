package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.MedicalService;

@Controller
@RequestMapping("/")
public class MedicalStoreController {
	private MedicalService medicalService;

	@GetMapping("/")
	public String getHome() {
		return "home";
	}
}
