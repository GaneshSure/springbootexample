package com.practice.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.practice.springbootexample.service.HelloService;

@SpringBootApplication
public class SpringbootexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringbootexampleApplication.class, args);
		HelloService helloService=context.getBean("helloService", HelloService.class);
		System.out.println(helloService.helloMessage("Ganesh Reddy Sure "));
		System.out.println("Number of Spring Bean objects Created by Spring Container ================>>>"+context.getBeanDefinitionCount());
		String[] names=context.getBeanDefinitionNames();
		for(String name : names) {
			System.out.println("Spring Bean name  ========================>> "+name);
		}

	}
}
