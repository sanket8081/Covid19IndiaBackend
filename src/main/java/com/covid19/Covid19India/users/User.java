package com.covid19.Covid19India.users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user_info")
public class User {
	
	public User()
	{
		super();
	}
	
	public User(String userid,String password)
	{
		this.userid=userid;
		this.password=password;
	}
	
	@Id
	String userid;
	String password;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
