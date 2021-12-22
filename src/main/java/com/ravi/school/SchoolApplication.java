package com.ravi.school;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SchoolApplication.class);

	public static void main(String[] args) {
		logger.info("Application has been started - Custom Logger statement");
		SpringApplication.run(SchoolApplication.class, args);
	}

}
