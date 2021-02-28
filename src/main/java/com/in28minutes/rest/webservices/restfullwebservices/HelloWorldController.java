package com.in28minutes.rest.webservices.restfullwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	//GET
	//URI - //hello-world-bean
	//method HelloWorldBean
	@GetMapping( path = "hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	//GET
	//URI - //hello-world-bean/path-variable/Robin
	//method HelloWorldBean
	@GetMapping( path = "hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}

}
