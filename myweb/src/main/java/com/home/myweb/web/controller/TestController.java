package com.home.myweb.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.myweb.web.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/myweb")
	public String getTest () {
		
		String test = testService.getTest();
		
		return test;
	}
	
	@PostMapping("/myweb")
	public String postTest () {
		
		String test = testService.getTest();
		
		return test;
	}
	
}
