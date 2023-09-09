package com.jenkins.maven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsGitMavenApplication {
	
	
	public static Logger logger=LoggerFactory.getLogger(JenkinsGitMavenApplication.class);
	
	@PostConstruct
	public void init()
	{
		logger.info("Application very much Started");
	}

	public static void main(String[] args) {
		logger.info("Application started executing");
		SpringApplication.run(JenkinsGitMavenApplication.class, args);
		
	}

}
