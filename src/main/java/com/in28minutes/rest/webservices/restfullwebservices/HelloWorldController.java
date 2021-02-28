package com.in28minutes.rest.webservices.restfullwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//controller
@RestController
public class HelloWorldController {
	
	//GET
	//URI - //hello-world
	//method "HelloWorld"
	@GetMapping( path = "hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	

}
