package com.work.assign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.kuliza.assign"})
public class AssignApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignApplication.class, args);
	}

}
