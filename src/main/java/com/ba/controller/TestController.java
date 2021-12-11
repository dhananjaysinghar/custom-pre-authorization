package com.ba.controller;

import com.ba.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private TestService testService;

	@GetMapping("/test-admin/{name}")
//	@PreAuthorize("@UserAccessService.hasAuthority(@environment.getProperty('app.security.access-right.hello-endpoint'), #name)")
	public String helloMessage(@PathVariable String name) {
		return testService.hello(name);
	}

}
