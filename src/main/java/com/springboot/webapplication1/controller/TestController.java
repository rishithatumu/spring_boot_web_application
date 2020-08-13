package com.springboot.webapplication1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@GetMapping(path="/")
	 public String sayHello()
	 {
		return "Hello!! Welcome to the Seamless Distribution Systems";
	 }
}
