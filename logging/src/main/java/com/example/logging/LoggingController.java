package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
  
	Logger logger = LoggerFactory.getLogger(LoggingApplication.class);

	@RequestMapping("/")
  public String index(){
		logger.trace("This is a TRACE message.");
		logger.debug("This is a DEBUG message.");
		logger.info("This is a INFO message.");
		logger.warn("This is a WARN message.");
		logger.error("This is a ERROR message.");
    return "Welcome to Spring Logging! Check the console to see the log messages.";
  }
}
