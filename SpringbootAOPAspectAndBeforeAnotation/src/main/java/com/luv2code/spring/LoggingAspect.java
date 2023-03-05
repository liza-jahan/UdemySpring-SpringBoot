package com.luv2code.spring;

import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.luv2code.spring.model.Alien;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(public * com.luv2code.spring.AlienController.getAliens())")
	public void log()
	{
		System.out.println("getAlien method called");
	}
}
