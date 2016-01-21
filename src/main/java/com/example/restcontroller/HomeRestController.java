package com.example.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.service.IHomeService;

@RestController
public class HomeRestController {

	@Autowired
	IHomeService service;

	@RequestMapping("/service/{param}")
	public @ResponseBody String getService(@PathVariable String param) {

		/*
		 * RestTemplate restTemplate = new RestTemplate();
		 * 
		 * String value = restTemplate.getForObject(
		 * "http://localhost:9090/home/tesrtetsete", String.class); return
		 * value;
		 * 
		 * String value = restTemplate.getForObject(
		 * "http://localhost:8080/echo/" + param, String.class);
		 */
		return service.getService(param);
	}

	@RequestMapping("/home/{param}")
	public @ResponseBody String getHomeService(@PathVariable String param) {

		return service.getHomeService(param);
	}

	@RequestMapping("/test/{param}")
	public @ResponseBody String getTestService(@PathVariable String param) {

		return service.getTestService(param);
	}
}
