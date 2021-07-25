package com.revature.services;

import java.util.List;

import com.revature.dao.UserRoleDAO;
import com.revature.models.UserRole;

public class UserRoleService {
private UserRoleDAO UserRolesDAO = new UserRoleDAO();
	
	//create a method that sends the DAO data up to the controller (this method will be called by the controller)
	public List<UserRole> getAllUserRoles() {
		return UserRolesDAO.getAllUserRoles();
	}
	
	//literally all we're doing here is calling the method of the dao in order to get the List of Ers_User_Roles
	

}
