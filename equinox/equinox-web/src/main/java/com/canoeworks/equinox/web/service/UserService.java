package com.canoeworks.equinox.web.service;

import com.canoeworks.equinox.commons.entity.User;

public interface UserService {
	
	public Boolean isUserExist(User user);
	
	public Boolean saveUser(User user);
	
	public User getUser(User user);
	
	public Boolean updateUser(User user);
	
	public Boolean deleteUser(User user);	

}
