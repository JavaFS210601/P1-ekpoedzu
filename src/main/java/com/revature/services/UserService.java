package com.revature.services;

import java.security.NoSuchAlgorithmException;
import java.util.List;


import org.apache.log4j.Logger;

import com.revature.dao.UserDAO;
import com.revature.models.User;
import com.revature.models.UserInterface;
import com.revature.models.UserRole;

public class UserService {
private UserInterface UserDAO = new UserDAO();
	
	//create a method that sends the DAO data up to the controller (this method will be called by the controller)
	public List<User> getAllUsers() {
		
					return UserDAO.getAllUsers();
	}
}
//	