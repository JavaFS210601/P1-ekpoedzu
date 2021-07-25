package com.revature.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.ReimbursementType;
import com.revature.services.ReimbursementTypeService;



public class ReimbursementTypeController {
	
	private ReimbursementTypeService rt = new ReimbursementTypeService();
	private ObjectMapper om = new ObjectMapper(); //ObjectMapper is part of Jackson api, used to 
												  //transform data from JSON -> Java or Java -> JSON
	
	//whenever you're working with HttpServletRequests/Responses, your method will need to throw an IOException
	public void getAllReimbursementType(HttpServletResponse res) throws IOException {
		
		
		List<ReimbursementType> ReimbursementList = rt.getAllReimbursements();
		
		//turn that List in a JSON String
		String json = om.writeValueAsString(ReimbursementList);

		//put the JSON into the response object (res)
		res.getWriter().print(json);
		
		//override the default 404 status code that we set in the MasterServlet
		res.setStatus(200);
		
	}

	public static void getAllReimbursementType(ReimbursementTypeController rtc) {
		// TODO Auto-generated method stub
		
	}

}


//}
