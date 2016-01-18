package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.aspect.LoggerAspect;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = { "com.example.aspect" })
public class AOPConfig {

	@Bean
	public LoggerAspect loggerAspect() {
		LoggerAspect la = new LoggerAspect();

		return la;
	}
}
