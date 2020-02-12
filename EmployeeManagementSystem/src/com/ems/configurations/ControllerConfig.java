package com.ems.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.ems"})
public class ControllerConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver()	{
		
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setPrefix("/webpages/");
		view.setSuffix(".jsp");
		return view;
	}
}