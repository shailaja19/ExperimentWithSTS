package com.sonata.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class RegisterController {

	
	 public String home() {
		 System.out.println("Going home....");
		 return "index";
	 }
}