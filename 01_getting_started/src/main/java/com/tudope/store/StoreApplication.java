package com.tudope.store;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tudope.store.entities.Profile;
import com.tudope.store.entities.User;

@SpringBootApplication
public class StoreApplication {
	public static void main(String[] args) {
		var user = User.builder()
				.name("John Doe")
				.email("john.doe@example.com")
				.password("password123")
				.build();

		var profile = Profile.builder()
				.bio("bio")
				.build();

		user.setProfile(profile);

		System.out.println(user);
	}
}
