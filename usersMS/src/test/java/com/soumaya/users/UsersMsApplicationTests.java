package com.soumaya.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.soumaya.users.entities.User;
import com.soumaya.users.repos.UserRepository;

@SpringBootTest
class UsersMsApplicationTests {
	@Autowired
 UserRepository userRep;
	@Test
	void contextLoads() {
	}
	
	@Test
	void testUsername() {
		User u = userRep.findByUsername("admin");
		
		System.out.println(u);
	}
}
