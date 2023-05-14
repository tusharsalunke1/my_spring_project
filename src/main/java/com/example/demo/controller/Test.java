package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Test {
	
	@ResponseBody
	@GetMapping("/test")
	public HttpStatus string(){
		return HttpStatus.ACCEPTED;
				
	}
}
