package com.canoeworks.equinox.web.service.impl;

import org.springframework.stereotype.Service;

import com.canoeworks.equinox.cassandra.CassandraDataStoreImpl;
import com.canoeworks.equinox.commons.entity.User;
import com.canoeworks.equinox.web.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	CassandraDataStoreImpl dataStore;
	
	@Override
	public Boolean isUserExist(User user) {
		return false;
	}

	@Override
	public Boolean saveUser(User user) {
		dataStore = new CassandraDataStoreImpl();
		//return dataStore.getUser() + "Logged in succesfully.";
		return false;
	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
}
