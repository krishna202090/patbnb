package com.pat.bnb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/RestAPI")
public class RestAPI {


	@GetMapping(path="/get")
	public String getData() {
		
		return "krishna rest api";
		
	}
}
