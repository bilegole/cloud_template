package com.bilegole.basicoauth.controller;

import jakarta.annotation.security.PermitAll;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class TestController {

	@PermitAll()
	@RequestMapping(path = "/hello")
	public String hello(){
		return "hello";
	}

	@PreAuthorize("isAuthenticated()")
	@RequestMapping(path = "/login")
	public String login(){
		return "login";
	}
}
