package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class MainController {
	
	@RequestMapping("/main")
	public String main(){
		return "main";
	}
	
}