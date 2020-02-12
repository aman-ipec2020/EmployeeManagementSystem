package com.ems.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String loginFunction(HttpServletRequest request)	{
		HttpSession session = request.getSession();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equalsIgnoreCase("aman") && password.equals("1234"))	{
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			
			return "forward:/home";
		}
		else
			return "index";
	}
}
