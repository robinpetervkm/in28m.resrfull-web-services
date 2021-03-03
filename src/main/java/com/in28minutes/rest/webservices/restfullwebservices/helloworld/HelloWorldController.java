package com.in28minutes.rest.webservices.restfullwebservices.helloworld;

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
	
	
	//###Internationalization
	
	//###Configuration
	
	//--LocaleResolver
	//	-Default Locale - Locale.US
	//--ResourceBundleMessageSource
	
	
	//###Usage
	//-- AutoWire Message Source
	//-- @RequestHeader(value = "Accept-Language",required = false) Locale locale
	//-- messageSource.getMessage("helloWorld.message",null,locale)
	
	
	
	
	
	//GET
	//URI - //hello-world-internationalized
	//method "Good Morning"
	@GetMapping( path = "hello-world-internationalized")
	public String helloWorldInternationalized() {
		return "Good Morning";
	}

}
