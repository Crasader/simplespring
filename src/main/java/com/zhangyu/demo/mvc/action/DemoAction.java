package com.zhangyu.demo.mvc.action;

import com.zhangyu.demo.service.IDemoService;
import com.zhangyu.spring.annotation.Autowried;
import com.zhangyu.spring.annotation.Controller;
import com.zhangyu.spring.annotation.RequestMapping;
import com.zhangyu.spring.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/demo")
public class DemoAction {

    @Autowried
    private IDemoService demoService;

    @RequestMapping("/query.json")
    public void query(HttpServletRequest req, HttpServletResponse resp,
                      @RequestParam("name") String name) {
        String result = demoService.get(name);
        System.out.println(result);
//		try {
//			resp.getWriter().write(result);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
    }

    @RequestMapping("/edit.json")
    public void edit(HttpServletRequest req, HttpServletResponse resp, Integer id) {

    }
}
