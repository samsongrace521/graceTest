package com.vv.spring.helloworld.service;

import com.vv.spring.helloworld.domain.Bean;

public interface HelloWorldService {

	public Bean getHelloWorld(String name);

	public Bean[] getAirInfo() throws Exception;

}