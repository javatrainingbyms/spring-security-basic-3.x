package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.UserService;
import com.example.demo.entity.UserInfo;

@RestController
public class TestController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/hello")
	public String helloAPI() {
		return "HELLO USER....!";
	}

	@GetMapping("/welcome")
	public String welcomeAPI() {
		return "WELCOME USER....!";
	}

	
}
