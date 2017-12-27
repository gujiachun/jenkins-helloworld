package com.rainbow.jenkins.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellowolrd {

	@GetMapping("/get")
	@ResponseBody
	public String get(){
		return "get";
	}
}
