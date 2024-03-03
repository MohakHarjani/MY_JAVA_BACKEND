package com.mohak.springpractise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mohak.springpractise.models.Employee;

@SpringBootApplication
public class SpringpractiseApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringpractiseApplication.class, args);
		Employee emp = (Employee)ctx.getBean("empBean");
		System.out.println(emp);
	}

}
