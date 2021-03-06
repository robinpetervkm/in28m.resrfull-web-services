package com.in28minutes.rest.webservices.restfullwebservices;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	public static final Contact DEFAULT_CONTACT = new Contact(
    "ROBIN PETER",
    "www.robinpeter.com",
    "robinpeter@gmail.com");
public static final ApiInfo DEFAULT_API_INFO
    = new ApiInfo(
    "Awesome Api Documentation",
    "Awesome Api Documentation",
    "Awesome 1.0",
    "urn:tos",
    DEFAULT_CONTACT,
    "Awesome Apache 2.0",
    "http://www.apache.org/licenses/LICENSE-2.0",
    new ArrayList<>());

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULT_API_INFO);
	}
	// Bean - Docket
		//Swagger 2
		//All the paths
		//All the Apis
}	
