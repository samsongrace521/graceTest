package com.vv.spring.helloworld.service.impl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vv.spring.helloworld.domain.Bean;
import com.vv.spring.helloworld.service.HelloWorldService;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public Bean getHelloWorld(String name) {

		return new Bean(name);
	}

	@Override
	public Bean[] getAirInfo() throws Exception {
		try {
			String str = json2String("src\\main\\resources\\air.json");
			ObjectMapper objectMapper = new ObjectMapper();
			Bean[] jsonObj = objectMapper.readValue(str, Bean[].class);

			// System.out.println("Bean Object\n" + (jsonObj == null ? "" : jsonObj.length));
			// System.out.println(">>>str" + str);
			return jsonObj;
		} catch (Exception e) {
			throw e;
		}

	}

	private String json2String(String path) throws IOException {
		StringBuilder result = new StringBuilder();
		InputStream in = new FileInputStream(path);
		// 读取文件上的数据。
		// 将字节流向字符流的转换。
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");// 读取
		// 创建字符流缓冲区
		BufferedReader bufr = new BufferedReader(isr);// 缓冲

		String line = null;
		while ((line = bufr.readLine()) != null) {
			result.append(System.lineSeparator() + line);
		}
		isr.close();
		return result.toString();
	}
}