package com.luv2code.spring;

import java.util.List;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.luv2code.spring.model.Alien;

@Aspect
@Component
public class LoggingAspect {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

	@Before("execution(public * com.luv2code.spring.AlienController.getAliens())")
	public void log() {
		LOGGER.info("getAlien method called");
	}

	@AfterReturning("execution(public * com.luv2code.spring.AlienController.getAliens())")
	public void logAfter() {
		LOGGER.info("getAlien method Executed");
	}
	@AfterThrowing("execution(public * com.luv2code.spring.AlienController.getAliens())")
	public void logExecption() {
		LOGGER.info("getAlien method Executed");
	}
}
