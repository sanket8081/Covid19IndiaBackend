package com.covid19.Covid19India.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userrepo;
	
	public List<User> getAllUsers()
	{
		ArrayList<User> users = new ArrayList<>();
		userrepo.findAll().forEach(users::add);
		return users;
		
	}
}
