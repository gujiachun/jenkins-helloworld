package com.rainbow.jenkins.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rainbow.jenkins.utils.string.TestStr;


@RestController
public class Hellowolrd {
	
	@Autowired
	private TestStr testStr;

	@GetMapping("/get")
	@ResponseBody
	public String get(){
		return "get - " + testStr.getStr();
	}
}
