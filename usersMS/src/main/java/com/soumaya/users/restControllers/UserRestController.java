package com.soumaya.users.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.soumaya.users.entities.User;
import com.soumaya.users.repos.UserRepository;

@RestController
@CrossOrigin(origins = "*")
public class UserRestController {
	@Autowired
	UserRepository userRep;

	@RequestMapping(value = "/login/{username}", method = RequestMethod.GET)
	public User getUserByUsername(@PathVariable("username") String username) {
		return userRep.findByUsername(username);
	}
}