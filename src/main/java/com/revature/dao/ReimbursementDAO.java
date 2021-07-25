package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Reimbursement;
import com.revature.utils.ConnectionUtil;

public class ReimbursementDAO implements ReimbursementDAOInterface {
	public List<Reimbursement> getAllReimbursement() {

		try(Connection conn = ConnectionUtil.getConnection()){
			
			String sql = "SELECT * FROM \"Project1\".reimbursement;"; //write your sql statement to send to the DB
			
			Statement s = conn.createStatement(); //create a statement object to execute our query
			
			ResultSet rs = s.executeQuery(sql); //put the result of the query into the ResultSet (Execute the query into it!)
			
			List<Reimbursement> ReimbursementList = new ArrayList<>(); //create a new ArrayList to hold all the Ers_Reimbursement  
			
			while(rs.next()) { //while there are still rows in our ResultSet
				
				Reimbursement r = new Reimbursement (
						rs.getInt("reimb_id"),
						rs.getInt("reimb_amount"),
						rs.getString("reimb_submitted"),
						rs.getString("reimb_resolved"),
						rs.getString("reimb_description"),
						rs.getInt("reimb_author"),
						rs.getInt("reimb_resolver"),
						rs.getInt("reimb_status_id"),
						rs.getInt("reimb_type_id")); 
					//after creating the Ers_Users, add it to the ArrayList
					ReimbursementList.add(r);
					
				}
			return ReimbursementList;
		} catch (SQLException e) {
			System.out.println("Sorry! It is failed");
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Reimbursement> getEmployeeReimbursements() {
			
			try(Connection conn = ConnectionUtil.getConnection()){
				
				String sql = "SELECT * FROM \"Project1\".ers_reimbursement WHERE reimb_author = 3;";
								
				ResultSet rs = null;				
				PreparedStatement ps = conn.prepareStatement(sql);
				rs = ps.executeQuery();
				List<Reimbursement> ReimbursementList = new ArrayList<>();
				
				while(rs.next()) {
					Reimbursement Ers_Reimbursement = new Reimbursement (	
							rs.getInt("reimb_id"), 
							rs.getInt("reimb_amount"),
							rs.getString("reimb_submitted"),
							rs.getString("reimb_resolved"),
							rs.getString("reimb_description"),
							rs.getInt("reimb_author"),
							rs.getInt("reimb_resolver"),
							rs.getInt("reimb_status_id"),
							rs.getInt("reimb_type_id")
							);
					ReimbursementList.add(Ers_Reimbursement);
				}
				return ReimbursementList;
				
			}catch (SQLException e) {
				System.out.println("Unable to view past transactions");
				e.printStackTrace();
			}
			return null;
		}

	public void addReimbursement_Request(int reimb_type_id, int reimb_amount, String reimb_description) {
	try (Connection conn = ConnectionUtil.getConnection()){
				//Setup sql string to exact parameters!
				String sql = "INSERT INTO \"ERS\".ers_reimbursement (reimb_amount, reimb_submitted, reimb_resolved, reimb_description, reimb_author, reimb_resolver, reimb_status_id, reimb_type_id)"
						+ "values(?, current_timestamp, null, ?, 5, 6, 1, ?);";
				
				//injecting user input into SQL
				PreparedStatement PreparedStatement = conn.prepareStatement(sql);
				PreparedStatement.setInt(1, reimb_amount);
				PreparedStatement.setString(2, reimb_description);
				PreparedStatement.setInt(3, reimb_type_id);
				PreparedStatement.executeUpdate();
			} catch (SQLException e) {
				System.out.println("Error: addReimbursement_Request Failed!");
				e.printStackTrace();
			}
		}

	
	public void acceptDenyReimbursement(int reimb_id, int reimb_status_id) {
	try (Connection conn = ConnectionUtil.getConnection()) {
				String sql = "UPDATE \"Project1\".ers_reimbursment SET reimb_status_id = ?, reimb_resolver = 2, reimb_resolved = current_timestamp WHERE reimb_id = ?;";
				
				//Preparing injection into server
				PreparedStatement PreparedStatement = conn.prepareStatement(sql);
				PreparedStatement.setInt(1, reimb_status_id);
				PreparedStatement.setInt(2, reimb_id);
				
			}catch (SQLException e) {
				System.out.println("Error: updating database failed");
				e.printStackTrace();
			}
		}

	@Override
	public void setReimbId(int int1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAmount(double double1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSubmitted(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResolved(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDesc(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAuthor(int int1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResolver(int int1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatusId(int int1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTypeId(int int1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getSubmitted() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAuthor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTypeId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getResolved() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getReceipt() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStatusId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getReimb_resolver() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getReimb_id() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDescription(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Reimbursement> getAllReimbursements() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
