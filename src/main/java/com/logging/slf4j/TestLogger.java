package com.logging.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//slf4j with native logback implementation.
public class TestLogger {
	
	private static final Logger logger=LoggerFactory.getLogger(TestLogger.class);
	
	public static void main(String[] args) {
		logger.info("logger info message : Hello world.");
		logger.debug("logger debug message.");
		logger.error("logger error message : {}","Error");
		logger.info("check debug enabled : "+logger.isDebugEnabled());
		logger.warn("logger warning message");
		
		logger.error("logger err msg exception:",new RuntimeException("Just throwing run time exception"));
	}
}
