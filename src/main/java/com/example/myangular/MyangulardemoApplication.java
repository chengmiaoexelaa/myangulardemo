package com.example.myangular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class MyangulardemoApplication {

//public class MyangulardemoApplication extends SpringBootServletInitializer implements WebApplicationInitializer{
//
//
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(MyangulardemoApplication.class);
//	}

	public static void main(String[] args) {
		SpringApplication.run(MyangulardemoApplication.class, args);
	}
}
