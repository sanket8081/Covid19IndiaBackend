package com.covid19.Covid19India.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userServ;
	
	@RequestMapping("/users")
	public List<User> getAllUsersInfo()
	{
		return userServ.getAllUsers();
	}
	
}
