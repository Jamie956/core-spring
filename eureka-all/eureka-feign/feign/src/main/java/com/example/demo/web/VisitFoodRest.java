package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.VisitFoodService;

@RestController
public class VisitFoodRest {

	@Autowired
	private VisitFoodService visitFoodService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String sayHi() {
		return visitFoodService.guest();
	}
}
