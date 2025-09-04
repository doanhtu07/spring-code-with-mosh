package com.tudope.store;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tudope.store.entities.Tag;
import com.tudope.store.entities.User;

@SpringBootApplication
public class StoreApplication {
	public static void main(String[] args) {
		var user = User.builder()
				.name("John Doe")
				.email("john.doe@example.com")
				.password("password123")
				.build();

		var tag = Tag.builder()
				.name("tag1")
				.build();

		user.addTag(tag);

		System.out.println(user);
	}
}
