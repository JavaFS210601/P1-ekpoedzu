package com.revature.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.revature.models.UserRole;

//the controller layer sits between the MasterServlet and the service layer
//this is usually where we'll parse JSON into Java or vice versa
//We'll either be getting data from the service (which got it from the DAO)
//or sending data to the service (which will validate it and send it to the DAO)

public class UserRoleController  extends HttpServlet{
	
	private static Logger log = Logger.getLogger(UserRoleController.class);

	private UserRole userrole = new UserRole(null);
	private ObjectMapper om = new ObjectMapper(); //ObjectMapper is part of Jackson api, used to 
												  //transform data from JSON -> Java or Java -> JSON
	
	//whenever you're working with HttpServletRequests/Responses, your method will need to throw an IOException
	public void getAllAvengers(HttpServletResponse res) throws IOException {
		
		
		List<UserRole> userroleList =userrole.getAllUserRoles();
		
		//turn that List in a JSON String
		String json = om.writeValueAsString(userroleList);

		//put the JSON into the response object (res)
		res.getWriter().print(json);
		
		//override the default 404 status code that we set in the MasterServlet
		res.setStatus(200);
		
	}

	public static void getAllUserrole(UserRoleController urc) {
		// TODO Auto-generated method stub
		
	}

}



