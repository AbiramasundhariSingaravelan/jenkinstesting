package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinsApplication {
	public static Logger logger=LoggerFactory.getLogger(DemoJenkinsApplication.class);
	@PostConstruct
	public void init()
	{
		logger.info("Application Started");
	}
	public static void main(String[] args) {
		logger.info("Application Executed");
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}

}
