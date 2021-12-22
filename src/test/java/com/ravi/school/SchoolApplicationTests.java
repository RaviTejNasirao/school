package com.ravi.school;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SchoolApplicationTests {
	
	public Logger logger = LoggerFactory.getLogger(SchoolApplication.class);


	@Test
	void contextLoads() {
		logger.info("Application Test has been started - Test Logger statement");
		
	}

}
