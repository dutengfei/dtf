package com.aaa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenusController {

	@RequestMapping("asdfghjkerty")
	public String save(HttpServletRequest reuqest){
		System.out.println("--------save------");
		reuqest.setAttribute("name", "zhangsan");
		reuqest.setAttribute("name", "zhangsan");
		return "index.jsp";
	}
	@RequestMapping("save1")
	public ModelAndView save1(){
		System.out.println("--------save------");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("name", "lisi");
		return mv;
	}
}
