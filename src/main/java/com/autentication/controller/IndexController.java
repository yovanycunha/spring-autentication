package com.autentication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@RequestMapping(value = "/disgraca", method = RequestMethod.GET)
	public String disgraca() {
		return "DISGRAAAAAÇA";
	}

}
