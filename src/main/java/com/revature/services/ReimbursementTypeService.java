package com.revature.services;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.controllers.ReimbusementTypeController;
import com.revature.models.ReimbursementType;


public class ReimbursementTypeService implements ReimbusementTypeInterface {

	private ReimbursementTypeService rt = new ReimbursementTypeService();
	private ObjectMapper om = new ObjectMapper(); //ObjectMapper is part of Jackson api, used to 
												  //transform data from JSON -> Java or Java -> JSON
	
	//whenever you're working with HttpServletRequests/Responses, your method will need to throw an IOException
	public void getAllReimbursementStatus(HttpServletResponse res ) throws IOException {
		
		
		List<ReimbursementType> rtList = rt.getAllReimbursementType();
		
		Object ReimbursementTypeList = null;
		//turn that List in a JSON String
		String json = om.writeValueAsString(ReimbursementTypeList);

		//put the JSON into the response object (res)
		res.getWriter().print(json);
		
		//override the default 404 status code that we set in the MasterServlet
		res.setStatus(200);
		
	}

	public static List<ReimbursementType> getAllReimbursementType() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ReimbursementType> getAllReimbursements() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getWriter() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setStatus(int i) {
		// TODO Auto-generated method stub
		
	}

	
	}

	




