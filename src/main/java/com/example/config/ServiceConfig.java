package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.intercepter.ServiceInterceptor;
import com.example.service.HomeService;
import com.example.service.IHomeService;

@Configuration
@EnableWebMvc
@ComponentScan("com.example.intercepter")
public class ServiceConfig extends WebMvcConfigurerAdapter {

	@Bean
	public IHomeService homeService() {
		IHomeService service = new HomeService();
		return service;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new ServiceInterceptor());
	}

}
