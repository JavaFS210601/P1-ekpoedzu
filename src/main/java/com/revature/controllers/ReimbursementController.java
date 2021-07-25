package com.revature.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Reimbursement;
import com.revature.models.ReimbursementDTO;
import com.revature.services.ReimbursementService;



public class ReimbursementController implements ReimbursementStatusControllerInterface {
	private ReimbursementService ReimbursementService = new ReimbursementService();
	private ObjectMapper om = new ObjectMapper(); //ObjectMapper is part of Jackson api, used to 
	private ReimbursementDTO ReimbursementDTO = new ReimbursementDTO();
	
	//transform data from JSON -> Java or Java -> JSON
	
	//whenever you're working with HttpServletRequests/Responses, your method will need to throw an IOException
	
	public void getAllErs_Reimbursement(HttpServletResponse res) throws IOException {
		
		//get the List of Ers_User_Roles from the service layer (which got it from the dao layer)
		List<Reimbursement> ReimbursementList = ReimbursementService.getAllReimbursement();
		
		//turn that List in a JSON String
		String json = om.writeValueAsString(ReimbursementList);

		//put the JSON into the response object (res)
		res.getWriter().print(json);
	
		//override the default 404 status code that we set in the MasterServlet
		res.setStatus(200);
	}
	  
	public void getEmployeeReimbursements(HttpServletResponse res) throws IOException {
		
		List<Reimbursement> ReimbursementList = ReimbursementService.getEmployeeReimbursements();
		try {
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String json = om.writeValueAsString(ReimbursementList);
		res.getWriter().print(json);
		res.setStatus(200);
	}
	
	public void addErs_Reimbursement_Request(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		if(req.getMethod().equals("POST")) {
			BufferedReader BufferedReader = req.getReader(); //BufferedReader reads text from an input string (in our case JSON)
			StringBuilder StringBuilder = new StringBuilder(); //create an empty StringBuilder
			String line = BufferedReader.readLine();  //this will read the contents of the BufferedReader into a String
			
			//Append lines that are not null for the buffer reader
			while(line != null) {
				StringBuilder.append(line);
				line = BufferedReader.readLine();
			}
			
			String body = new String(StringBuilder);
			ReimbursementDTO ReimbursementDTO = om.readValue(body, ReimbursementDTO.class);
		ReimbursementService.addReimbursement_Request(ReimbursementDTO.reimb_type_id, ReimbursementDTO.reimb_amount, ReimbursementDTO.reimb_description);
			res.setStatus(200);
			
			
		}
	}
	
	public void acceptDenyReimbursement(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		if(req.getMethod().equals("POST")) {
			BufferedReader BufferedReader = req.getReader(); //BufferedReader reads text from an input string (in our case JSON)
			StringBuilder StringBuilder = new StringBuilder();  //create an empty StringBuilder
			String bfLine = BufferedReader.readLine(); //this will read the contents of the BufferedReader into a String
			//Append lines that are not null with the buffer reader
			while(bfLine != null) {
				StringBuilder.append(bfLine);
				bfLine = BufferedReader.readLine();
			}
			
			String body = new String(StringBuilder);
			
			ReimbursementDTO ReimbursementDTO = om.readValue(body, ReimbursementDTO.class);
			ReimbursementService.acceptDenyReimbursement(ReimbursementDTO.reimb_id, ReimbursementDTO.reimb_status_id);
			res.setStatus(200);
			res.getWriter().print("Controller accessed");;
		}
	}

	public static void addReimbursement_Request(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllReimbursementStatus(ReimbursementStatusControllerInterface rsc) {
		// TODO Auto-generated method stub
		
	}

	

}