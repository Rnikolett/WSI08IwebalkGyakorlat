package com.WSI08I.semTaskWSI08I.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{
	public void addViewControllers(ViewControllerRegistry registry) {
		
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/games").setViewName("games");
		registry.addViewController("/new").setViewName("new");
		registry.addViewController("/refresh").setViewName("refresh");
		registry.addViewController("/view").setViewName("view");

	}
}
