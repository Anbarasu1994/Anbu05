package com.javatech.springawsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAwsApplication {
@GetMapping("/")
	public String home(){
		return "..wellcom to aws...";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAwsApplication.class, args);
	}

}
