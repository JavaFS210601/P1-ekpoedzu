package com.revature.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.ReimbursementStatus;
import com.revature.services.ReimbursementStatusService;



public class ReimbursementSatatusController {

	private ReimbursementStatusService rs = new ReimbursementStatusService();
	private ObjectMapper om = new ObjectMapper(); //ObjectMapper is part of Jackson api, used to 
	private Object ReimbursementStatusList;
												  //transform data from JSON -> Java or Java -> JSON
	
	//whenever you're working with HttpServletRequests/Responses, your method will need to throw an IOException
	public void getAllReimbursementStatus(HttpServletResponse res) throws IOException {
		
		
		List<ReimbursementStatus> rsList = rs.getAllReimbursementStatus();
		
		//turn that List in a JSON String
		String json = om.writeValueAsString(ReimbursementStatusList);

		//put the JSON into the response object (res)
		res.getWriter().print(json);
		
		//override the default 404 status code that we set in the MasterServlet
		res.setStatus(200);
		
	}

	

}
