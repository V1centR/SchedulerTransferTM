package com.schedulertm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*
@SpringBootApplication(scanBasePackages = {"com.schedulertm"})
@ComponentScan(basePackages = "com.*")
@EntityScan("com.schedulertm.entities")*/
public class SchedulertmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulertmApplication.class, args);
	}

}
