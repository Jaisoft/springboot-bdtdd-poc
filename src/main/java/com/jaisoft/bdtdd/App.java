package com.jaisoft.bdtdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.jaisoft.bdtdd.infrastructure.springservice")
@ComponentScan(basePackages = "com.jaisoft.bdtdd.infrastructure.springrest")
@ComponentScan(basePackages = "com.jaisoft.bdtdd.infrastructure.springdatamongo.dao")
@SpringBootApplication
public class App {
	public static void main (String[] args) {
		SpringApplication.run(App.class, args);
	}
}
