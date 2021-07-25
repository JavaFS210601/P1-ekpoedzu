package com.revature.dao;
import com.revature.models.UserRole;
import com.revature.utils.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



public class UserRoleDAO implements  UserRoleInterface {
	public List<UserRole> getAllUserRole() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserRole getAllUserRoleById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public UserRole getUserRoleByRole(String role) {

		try(Connection conn = ConnectionUtil.getConnection()) {

			String sql = "SELECT * FROM \"Project1\".ers_user_roles WHERE user_role_id = ?;";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, role); //set our wildcard to the parameter given in the method

			ResultSet rs = ps.executeQuery(); //the results of our query will be put into the ResultSet object

			while(rs.next()) { //we won't need a while loop, we're only expecting one result

				//Just for the sake of showing you a different way to populate a user object...
				//...using the setters instead of the constructor like we did in getAllReimbursement()	
				UserRole ur = new UserRole();
						ur.getInt("ers_user_role_id");
				        ur.getString("user_role");
				
						//instantiate an empty home object

				//use the setters to populate its fields
				 //this can just be the name object getting sent in from the parameters
						
				//return object
						
					return ur ;
				
			}
				
		} catch (SQLException e) {
			System.out.println("Couldn't get user role by id");
			e.printStackTrace();
		}



		return null;

	
	}

	@Override
	public Object getUserRoleById(int int1) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserRole> getAllUserRoles() {
		// TODO Auto-generated method stub
		return null;
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
