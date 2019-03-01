package com.zhangyu.demo.service.impl;


import com.zhangyu.demo.service.IDemoService;
import com.zhangyu.spring.annotation.Service;

@Service
public class DemoService implements IDemoService {

	public String get(String name) {
		return "My name is " + name;
	}

}
