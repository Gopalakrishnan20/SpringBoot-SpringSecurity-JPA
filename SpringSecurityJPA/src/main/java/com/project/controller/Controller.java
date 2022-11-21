package com.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>"
				+ "<a href='/logout'> logout</a>");
	}
	@RequestMapping("/user")
	public String userHome() {
		return ("<h1>Welcome User</h1>"
				+ "<a href='/logout'> logout</a>");
	}
	@RequestMapping("/admin")
	public String adminHome() {
		return ("<h1>Welcome Admin</h1>"
				+ "<a href='/logout'> logout</a>");
	}

}
