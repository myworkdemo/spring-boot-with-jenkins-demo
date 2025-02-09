package com.dem.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootWithJenkinsDemoApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringBootWithJenkinsDemoApplicationTests.class);
	
	@Test
	public contextLoads() {
		logger.info("Test case executing...");
		logger.info("Test case executing second...");
		assertEquals(true, true);
	}

}
