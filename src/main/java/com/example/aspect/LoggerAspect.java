package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@Component
public class LoggerAspect {

	private static final Logger logger = LoggerFactory
			.getLogger(LoggerAspect.class);

	@Before("execution(* com.example.service.*Service.*Service(..))")
	public void loggedBefore(JoinPoint joinpoint) {

		String callFunctionName = joinpoint.getSignature().toShortString();
		Object[] args = joinpoint.getArgs();
		logger.info("//// Capture before //////");
		logger.info("/// service function called : " + callFunctionName);

		for (Object obj : args) {
			logger.info("/// Args : " + obj.toString());
		}
	}

	@After("execution(* com.example.service.*Service.*Service(..))")
	public void loggedAfter(JoinPoint joinpoint) {
		String callFunctionName = joinpoint.getSignature().toShortString();
		Object[] args = joinpoint.getArgs();
		logger.info("//// Capture After //////");
		logger.info("/// service function finished : " + callFunctionName);
		
	}
}
