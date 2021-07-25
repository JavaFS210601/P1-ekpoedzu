package com.revature.services;
import java.util.List;
import com.revature.dao.UserDAO;
import com.revature.models.User;

public class ManagerService {
	public  boolean login(String username, String password) 
	{
		boolean result =  secureLogin(username, password);
		
		return result;
	}
	
	private  boolean secureLogin(String username, String password)
	{
		//Creating Users List and checking the Username and Passwords.
				UserDAO UserDAO = new UserDAO();
				List<User> UsersList = UserDAO.getAllUsers();
				int trueRoleID = 2;
				boolean result = false;  
				
				for (User u: UsersList)
				{
					String tempUser = u.getErs_username();
					String tempPass = u.getErs_password();
					int tempRoleID = u.getUser_role_id();
					if(username.equals(tempUser) && password.equals(tempPass) && tempRoleID == trueRoleID) {
						result = true;
					}
				}
				return result;
	}
	
}