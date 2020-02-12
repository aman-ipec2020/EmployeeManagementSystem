package com.ems.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String homeFunction(HttpServletRequest request)	{
	
		HttpSession session = request.getSession();
		ModelAndView mv = new ModelAndView();
		mv.addObject("username", session.getAttribute("username"));
		return "home";
	}
}
