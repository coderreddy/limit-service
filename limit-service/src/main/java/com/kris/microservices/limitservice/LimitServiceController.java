package com.kris.microservices.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitServiceController {

	@Autowired
	CloudConfiguration cloudConfiguration;

	@GetMapping("/limits")
	public LimitServiceConfiguration getLimitService() {
		return new LimitServiceConfiguration(cloudConfiguration.getMinimum(), cloudConfiguration.getMaximum());
	}

}
