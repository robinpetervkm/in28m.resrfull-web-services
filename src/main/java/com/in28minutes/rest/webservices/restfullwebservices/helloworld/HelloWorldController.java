package com.in28minutes.rest.webservices.restfullwebservices.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

//controller
@RestController
public class HelloWorldController {
	
	//-- AutoWire Message Source
	
	@Autowired
	private MessageSource messageSource;
	
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
	//-- @RequestHeader(value = "Accept-Language",required = false) Locale locale
	public String helloWorldInternationalized(
			@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
		//-- messageSource.getMessage("helloWorld.message",null,locale)
		return messageSource.getMessage("good.morning.message",null,locale);
	}

}
