package com.example.codewithapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.codewithapi")
public class CodewithapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodewithapiApplication.class, args);
			System.out.println("application started");

	}

}
