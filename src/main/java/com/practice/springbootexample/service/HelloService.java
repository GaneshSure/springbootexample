package com.practice.springbootexample.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	public String helloMessage(String msg) {
		return "Hello " +msg+"Welcome to the SpringBootExample Application";
	}
}
