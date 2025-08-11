package com.easycode.tser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/sayhello")
	public String sayHello(@RequestParam("username") String username) {
		
		return "Hello! from "+username;
	}

}
