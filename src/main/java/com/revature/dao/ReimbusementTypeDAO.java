package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.models.ReimbursementType;
import com.revature.models.ReimbursementTypeInterface;
import com.revature.utils.ConnectionUtil;

public class ReimbusementTypeDAO implements ReimbursementTypeInterface{
	
	public List<ReimbursementType> getAllReimbursementTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public ReimbursementType getReimbursementTypeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ReimbursementType getReimbursementTypeByType(String type, Object id) {

		try(Connection conn = ConnectionUtil.getConnection()) {

			String sql = "SELECT * FROM \"Project1\".ers_reimbursement_type WHERE reimb_type = ?;";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, type); //set our wildcard to the parameter given in the method

			ResultSet rs = ps.executeQuery(); //the results of our query will be put into the ResultSet object

			if(rs.next()) { //we won't need a while loop, we're only expecting one result

				//Just for the sake of showing you a different way to populate a Home object...
				//...using the setters instead of the constructor like we did in getAllAvengers()	
				ReimbursementType rt = new ReimbursementType(); //instantiate an empty home object

				//use the setters to populate its fields
				rt.setReimbursementType_id(id); //this can just be the name object getting sent in from the parameters
				rt.setReimbursementType_type(type);

				return rt; //return the home object
			}


		} catch (SQLException e) {
			System.out.println("Not relevant");
			e.printStackTrace();
		}



		return null;
	}

	@Override
	public ReimbursementType getReimbursementTypeByType(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	




}































//import java.util.List;
//
//import org.hibernate.Session;
//
//import com.revature.models.ReimbursementType;
//import com.revature.utils.HibernateUtil;
////import com.revature.utils.HibernateUtil;
//public class ReimbursementTypeDAO {
//	
//
//	public ReimbursementType getTypeById(int id) {
//		Session ses = HibernateUtil.getSession();
//		ReimbursementType rt = ses.get(ReimbursementType.class, id);
//		HibernateUtil.closeSession();
//		return rt;
//	}	
//	
//
//	@SuppressWarnings("hiding")
//	public <ReimbursementType> List<ReimbursementType> findAllReimbursementss(){
//		
//		Session ses = HibernateUtil.getSession();
//		@SuppressWarnings("unchecked")
//		List<ReimbursementType> reimbursementtypeList = ses.createQuery("FROM ReimbursementType").list(); //at the end, we turn the Query object into a List
//		HibernateUtil.closeSession();
//		return reimbursementtypeList;
//		
//		
//	}
//
//
//	public void insertReimbursementType(com.revature.models.ReimbursementType rt1) {
//		// TODO Auto-generated method stub
//		
//	}
//}

