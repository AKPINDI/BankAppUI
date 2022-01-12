package com.springboot.bankApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class BankAppUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAppUiApplication.class, args);
	}

}
