package com.example.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.example.aspect.LoggerAspect;

public class ServiceInterceptor extends HandlerInterceptorAdapter {

	private static final Logger logger = LoggerFactory
			.getLogger(LoggerAspect.class);

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest rq, HttpServletResponse rs,
			Object obj, ModelAndView mv) throws Exception {
		
		logger.info("ServiceInterceptor  post ---- response result : "+ rs.getStatus());
	
	}

	@Override
	public boolean preHandle(HttpServletRequest rq, HttpServletResponse rs,
			Object obj) throws Exception {
		
		logger.info("ServiceInterceptor pre ----  request uri : "+ rq.getRequestURI());
		return true;
	}

}
