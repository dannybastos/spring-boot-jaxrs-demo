package com.example.jaxrsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@SpringBootApplication
public class JaxrsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaxrsDemoApplication.class, args);
	}
}
