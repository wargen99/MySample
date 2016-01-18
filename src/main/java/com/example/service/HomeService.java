package com.example.service;

public class HomeService implements IHomeService {

	@Override
	public String getService(String param) {
		return param + " service";
	}

	@Override
	public String getHomeService(String param) {
		return param + " homeservice";
	}

	@Override
	public String getTestService(String param) {
		return param + " testservice";
	}

}
