package com.example.demo;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserAssignment {
	
	List<User> users = new ArrayList<User>(Arrays.asList(
			new User("admin", "pass"),
			new User("foo", "foo"),
			new User("user", "pass")));

	@RequestMapping(method=RequestMethod.POST, value="/user", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String userAuth(@RequestBody User user) {
		for(User u : users) {
			if(u.getUserName().equals(user.getUserName()) && u.getPassword().equals(user.getPassword()))
				return "valid user";		
		}
		return "invalid user";
		
	}
	
}
