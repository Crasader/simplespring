package com.zhangyu.demo.mvc.action;

import com.zhangyu.demo.service.IDemoService;
import com.zhangyu.spring.annotation.Autowried;
import com.zhangyu.spring.annotation.Controller;
import com.zhangyu.spring.annotation.RequestMapping;

@Controller
public class MyAction {
		@Autowried
		IDemoService demoService;
	
		@RequestMapping("/index.html")
		public void query(){

		}
	
}
