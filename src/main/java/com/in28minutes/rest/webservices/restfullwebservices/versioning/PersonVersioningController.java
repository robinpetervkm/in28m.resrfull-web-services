package com.in28minutes.rest.webservices.restfullwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
	
	
	//URI Versioning---Twitter
	@GetMapping("v1/person")
	public PersonV1 personV1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping("v2/person")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	//Reqest param Versioning---- AMAZON
	@GetMapping(value="person/param",params = "version=1")
	public PersonV1 paramV1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(value="person/param",params = "version=2")
	public PersonV2 paramV2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	//Custom Versioning----Microsoft
	
	@GetMapping(value="person/header",headers = "X-API-VERSION=1")
	public PersonV1 headerV1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(value="person/header",headers = "X-API-VERSION=2")
	public PersonV2  headerV2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	// Media type - Content negotiation, accept Header versioning--- GitHub
	@GetMapping(value="person/produces",produces = "application/vnd.company.app-v1+json")
	public PersonV1 producesV1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(value="person/produces",produces = "application/vnd.company.app-v2+json")
	public PersonV2  producesV2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}

	/*Factors
		- URI Pollution--- URI and Custom
		- MisUse of URI Header
		- Caching-- difficult in media type and Custom
		- Can we execute the request on the browser--- difficult in media type and Custom
		- API Documentation--difficult in media type and Custom
	- no perfect solution 
	
	Filalize the versioning starting of the project
	
	*/
	
	
}
