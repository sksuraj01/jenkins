package com.jenkins.maven;

import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsGitMavenApplicationTests {
	
	
	public static Logger logger=LoggerFactory.getLogger(JenkinsGitMavenApplicationTests.class);

	@Test
	void contextLoads() {
		
		logger.info("Application testing....");
		assertEquals(true,true);
	}

}
