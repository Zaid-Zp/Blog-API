package com.BloggingAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class BloggingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloggingApiApplication.class, args);
		
//		System.out.println("Hello...");
	}

}
