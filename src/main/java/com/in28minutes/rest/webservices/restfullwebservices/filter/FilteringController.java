package com.in28minutes.rest.webservices.restfullwebservices.filter;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
	//field1,field2
	@GetMapping("/filtering")
	public SomeBean retriveSomeBean() {
		SomeBean someBean = new SomeBean("value1","value2","value3");
		
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
		
		return someBean;
		
		
	}
	//field2,filed3
	@GetMapping("/filtering-list")
	public List<SomeBean> retriveListOfSomeBean() {
		return Arrays.asList(new SomeBean("value1","value2","value3"),
				new SomeBean("value11","value22","value33"));
	}
}