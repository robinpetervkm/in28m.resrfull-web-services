package com.in28minutes.rest.webservices.restfullwebservices;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class RestfullWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullWebServicesApplication.class, args);
	}
	//###Configuration
	
	//--LocaleResolver
	
	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		//		-Default Locale - Locale.US
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
	}
	//--ResourceBundleMessageSource
	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}
	
}
