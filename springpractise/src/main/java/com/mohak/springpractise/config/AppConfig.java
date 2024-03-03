package com.mohak.springpractise.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mohak.springpractise.models.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	Employee empBean()
	{
		return new Employee();
	}
	

}
