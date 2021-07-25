package com.revature.controllers;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.User;
import com.revature.services.UserService;

//the controller layer sits between the MasterServlet and the service layer
//this is usually where we'll parse JSON into Java or vice versa
//We'll either be getting data from the service (which got it from the DAO)
//or sending data to the service (which will validate it and send it to the DAO)
public class UserController {

	//private static final Object Users_List = null;

	private UserService UserService = new UserService();
	
	private ObjectMapper om = new ObjectMapper(); //ObjectMapper is part of Jackson api, used to 
	//transform data from JSON -> Java or Java -> JSON
	
	//whenever you're working with HttpServletRequests/Responses, your method will need to throw an IOException
	public void getAllUsers(HttpServletResponse res) throws IOException {
		
		//get the List of UserRoles from the service layer (which got it from the dao layer)
		List<User> UserList = UserService.getAllUsers();
		
		//turn that List in a JSON String
		String json = om.writeValueAsString(UserList);

		//put the JSON into the response object (res)
		res.getWriter().print(json);
	
		//override the default 404 status code that we set in the MasterServlet
		res.setStatus(200);
	}

//	private void setStatus(int i) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private Object getWriter() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static void getAllUsers(UserController uc) {
//		// TODO Auto-generated method stub
//		
	}
