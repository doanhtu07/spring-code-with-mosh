package com.tudope.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tudope.store.services.UserService;

@SpringBootApplication
public class StoreApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var userService = context.getBean(UserService.class);
		userService.deleteRelated();
	}
}
