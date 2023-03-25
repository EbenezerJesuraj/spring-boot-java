package com.crudtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class CrudTutorialApplication {

	public static void main(String[] args) {
		System.out.println("Inside of main");
		SpringApplication.run(CrudTutorialApplication.class, args);
	}

}
