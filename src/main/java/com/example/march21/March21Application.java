package com.example.march21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class March21Application {

	public static void main(String[] args) {
		SpringApplication.run(March21Application.class, args);
	}

	@RequestMapping(value = "/")
	public String hello()
	{
		return "<h1> Hello World </h1>";
	}

	@RequestMapping(value = "/index")
	public String index()
	{
		return "This is index page";
	}

}
