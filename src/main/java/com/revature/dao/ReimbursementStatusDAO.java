package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.ReimbursementStatus;
import com.revature.models.ReimbursementStatusInterface;
import com.revature.utils.ConnectionUtil;

public class ReimbursementStatusDAO implements ReimbursementStatusInterface {
	
	private ReimbursementStatusDAO rsDAO = new ReimbursementStatusDAO(); //instantiating a HomeDAO object to use its methods

	
public List<ReimbursementStatus> getAllReimbursementStatus(){
	try(Connection conn = ConnectionUtil.getConnection()){
		
		String sql = "SELECT* FROM \"Project1\".ReimbursementStatus;";
		Statement s = conn.createStatement(); //create a statement object to execute our query
	
		ResultSet rs = s.executeQuery(sql); //put the result of the query into the ResultSet 
											//(Execute the query into it!)

		List<ReimbursementStatus> ReimbursementStatusList = new ArrayList<>(); //create a new ArrayList to hold all the Avengers



		while(rs.next()) { //while there are still rows in our ResultSet

			//make a new Reimbursement object for each row
			ReimbursementStatus RS = new ReimbursementStatus (
				rs.getInt("reimb_status_id"),
				rs.getString("reimb_status"),
				
				null//here's the fun part, I'll add the Home object below
			);

		}


	} catch (SQLException e) {
		System.out.println("Get all reimbursements failed!");
		e.printStackTrace();
	}


	return null;
}




}
	
	
	
	
	









