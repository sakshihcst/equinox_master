package com.canoeworks.equinox.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.canoeworks.equinox.commons.entity.User;
import com.canoeworks.equinox.web.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;

    @RequestMapping(value = "/login/", method = RequestMethod.GET)
    //public String loginUser(@RequestBody User user) {
    	public String loginUser() {
    		User user = new User();
    		user.setFirstName("Sakshi");
    		user.setLastName("Gupta");
	    	if (userService.isUserExist(user)) {
	    		System.out.println("A User with name " + user.getFirstName() + " already exist");
	        //return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	    		return "";
	    	}
	    	userService.getUser(user);
	    	return "";
    }
    
    @RequestMapping(value = "/register/", method = RequestMethod.POST)
    public String registerUser(@RequestBody User user) {
	    	if (userService.isUserExist(user)) {
	    		System.out.println("A User with name " + user.getFirstName() + " already exist");
	        //return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	    		return "";
	    	}
	    	userService.saveUser(user);
	    	return "";
    }
    
}