package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.User;
import com.revature.models.UserInterface;
import com.revature.utils.ConnectionUtil;

public class UserDAO implements UserDAOInterface, UserInterface {
	//private static UserRoleInterface urDAO = new UserRoleDAO(); 

	
public  List<User> getAllUsers(){
	try(Connection conn = ConnectionUtil.getConnection()){
		
		String sql = "SELECT* FROM \"Project1\".ers_users;";
		Statement s = conn.createStatement(); //create a statement object to execute our query
	
		ResultSet rs = s.executeQuery(sql); //put the result of the query into the ResultSet 
											//(Execute the query into it!)

		List<User> userList = new ArrayList<>(); //create a new ArrayList to hold all the Avengers



		while(rs.next()) { //while there are still rows in our ResultSet

			//make a new
			User u = new User (
				rs.getInt("ers_user_d"),
				rs.getString("res_user_name"),
				rs.getString("user_password"),
				rs.getString("user_first_name"),
				rs.getString("user_last_name"),
				rs.getString("user_email"),
				rs.getInt("user_role_id"),
				null 
				//here's the fun part, I'll add the Home object below
			);
			//after creating the Avenger object, and adding a home_fk field if it exists, add it to the ArrayList
			userList.add(u);
		}
		//outside our while loop, once all avengers have been added, return the ArrayList
				return userList;
			//if 
//			if(rs.getString("userrole_fk") != null) {
//				try {
//					User user = new User();
//					user.setUserRole_fk(urDAO.getUserRoleById(rs.getInt("user_role_id_fk")));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		}
				

	return null;
}


}






























//	public User findUserByUsernameAndPassword(String username, String password) {
//		Session ses = HibernateUtil.getSession();
//		
//		
//		String hql = "FROM User as user WHERE user.username = :username"  
//				+ " AND user.password = :password";
//		Query query = ses.createQuery(hql);
//		query.setParameter("username",username);
//		query.setParameter("password", password);
//		User user = (User)query.getSingleResult();
//		
//		
//		HibernateUtil.closeSession();
//		
//		return user;
//	}
//	
//	public void insertUser(User user) {
//		
//		Session ses = HibernateUtil.getSession();
//		
//		ses.save(user);
//		
//		HibernateUtil.closeSession();
//	}
//
//
//	public User updateUser(User user) {
//		
//		Session ses = HibernateUtil.getSession();
//		
//		ses.merge(user); 
//		//this will update the entire food record in the database
//		// merge over update because merge is safer
//		return user;
//	}
//	
//	public User selectUserById(int id) {
//		
//		Session ses = HibernateUtil.getSession();
//		
//		// create a new food object by getting data from database with the id.
//		//User user = ses.load(User.class, id);
//		User user = (User)ses.createQuery("FROM User as user WHERE user.id = " + id).getSingleResult();
//		
//		
//		HibernateUtil.closeSession();
//		
//		return user;
//		
//	}
//	
//	public User getUserById(int id) {
//		
//		Session ses = HibernateUtil.getSession();
//		
//		// create a new food object by getting data from database with the id.
//		User user = ses.get(User.class, id);
//		
//		HibernateUtil.closeSession();
//		
//		return user;
//		
//	}
//	
//	public List<User> findAllUsers(){
//		
//		Session ses = HibernateUtil.getSession();
//		
//		//Using HQL! Hibernate Query Language that references the java class
//		// e.g. "Food" in our model package, instead of "Food" in database.
//		
//		List<User> userList = ses.createQuery("FROM User").list();
//		// at the end, we are turing the results into a list
//		
//		HibernateUtil.closeSession();
//		
//		return userList;
//		
//	}
//	
////	
////	public UserRole getUserRoleByName(int id) {
////		Session ses = HibernateUtil.getSession();
////		
////		UserRole userRole = ses.get(UserRole.class, id);
////		
////		HibernateUtil.closeSession();
////		
////		return userRole;
////	}
//
//
//	public List<UserRole> getAllUserRole() {
//		Session ses = HibernateUtil.getSession();
//		
//		
//		List<UserRole> userRoleList = ses.createQuery("FROM UserRole").list();
//		
//		HibernateUtil.closeSession();
//		
//		return userRoleList ;
//		
//		
//	}
//
//	public User getUserByUsername(String username) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public User getAllUsers() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public User addUser(User u) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
//
//
//
//
//
////	public User findUserByUsernameAndPassword(String username, String password) {
////		Session ses = HibernateUtil.getSession();
////		
////		// create a new food object by getting data from database with the id.
////		//User user = ses.load(User.class, id);
////		//User user = (User)ses.createQuery("FROM User as user WHERE user.username = :username"  
////				//+ " AND user.password = :password");
////		String hql = "FROM User as user WHERE user.username = :username"  
////				+ " AND user.password = :password";
////		Query query = ses.createQuery(hql);
////		query.setParameter("username",username);
////		query.setParameter("password", password);
////		User user = (User)query.getSingleResult();
////		
////		
////		HibernateUtil.closeSession();
////		
////		return user;
////	}
////	
////	public void insertUser(User user) {
////		
////		Session ses = HibernateUtil.getSession();
////		
////		ses.save(user);
////		
////		HibernateUtil.closeSession();
////	}
////
////
////	public void updateUser(User user) {
////		
////		Session ses = HibernateUtil.getSession();
////		
////		ses.merge(user); 
////		//this will update the entire food record in the database
////		// merge over update because merge is safer
////	}
////	
////	public User selectUserById(int id) {
////		
////		Session ses = HibernateUtil.getSession();
////		
////		// create a new food object by getting data from database with the id.
////		//User user = ses.load(User.class, id);
////		User user = (User)ses.createQuery("FROM User as user WHERE user.id = " + id).getSingleResult();
////		
////		
////		HibernateUtil.closeSession();
////		
////		return user;
////		
////	}
////	
////	public User getUserById(int id) {
////		
////		Session ses = HibernateUtil.getSession();
////		
////		// create a new food object by getting data from database with the id.
////		User user = (User) ses.get(User.class, id);
////		
////		HibernateUtil.closeSession();
////		
////		return user;
////		
////	}
////	
////	public List<User> findAllUsers(){
////		
////		Session ses = HibernateUtil.getSession();
////		
////		//Using HQL! Hibernate Query Language that references the java class
////		// e.g. "Food" in our model package, instead of "Food" in database.
////		
////		List<User> userList = ses.createQuery("FROM User").list();
////		// at the end, we are turing the results into a list
////		
////		HibernateUtil.closeSession();
////		
////		return userList;
////		
////	}
////	
//////	
//////	public UserRole getUserRoleByName(int id) {
//////		Session ses = HibernateUtil.getSession();
//////		
//////		UserRole userRole = ses.get(UserRole.class, id);
//////		
//////		HibernateUtil.closeSession();
//////		
//////		return userRole;
//////	}
////
////
////	public List<UserRole> getAllUserRole() {
////		Session ses = HibernateUtil.getSession();
////		
////		
////		List<UserRole> userRoleList = ses.createQuery("FROM UserRole").list();
////		
////		HibernateUtil.closeSession();
////		
////		return userRoleList ;
////		
////		
////	}
////}
//
//
//   
////	//private List<user> usersList;
////	public void insertUser(UserType user) {
////		Session ses = HibernateUtil.getSession();
////		ses.save(user);
////		HibernateUtil.closeSession();
////	}
////	
////	public boolean addUser(UserType users) throws HibernateException {
////		Session ses = HibernateUtil.getSession();
////		
////		try {
////			ses.save(users);
////			return true;
////		} finally {
////			HibernateUtil.closeSes();
////		}
////	}
////		public boolean updateUsers(User user) throws HibernateException {
////			Session ses = HibernateUtil.getSession();
////			
////			Transaction trans = ses.beginTransaction();
////			
////			try {
////				ses.merge(user);
////				trans.commit();
////				return true;
////			} finally {
////				HibernateUtil.closeSes();
////			}
////		}	
////	
////		public User selectUsertById(int id) {
////			Session ses = HibernateUtil.getSession();
////			
////			User user = (User) ses.get(User.class, id);
////			HibernateUtil.closeSession();
////			return user;
////		}
////		
//////		public <user> List<user> findAllUsers(){
//////		Session ses = null;
//////		@SuppressWarnings({ "null", "unchecked" })
//////		List<User> UserList = ses.createQuery("FROM User").list();
//////		HibernateUtil.closeSession();
//////		return (List<user>) userList;
////
////		
////	public List<User> getAllUsers() {
////		Session ses = HibernateUtil.getSession();
////		
////		List<User> list = ses.createQuery("FROM User").list();
////		
////		return list;
////	}
////
////	
////	public User getUserById(int id) {
////		Session ses = HibernateUtil.getSession();
////		
////		User user = (User) ses.get(User.class, id);
////		
////		return user;
////	}
////
////	public User getUserByUsername(String username) {
////		Session ses = HibernateUtil.getSession();
////		
////		List<User> list = ses.createQuery("FROM User WHERE userName = '"+username+"'", User.class).list();
////		User user = list.get(0);
////		
////		return user;
////	}
////		}
////	
//
////}
////
//////	public UserDAO() {
//////		super();
//////	}
////////	
////////	public boolean addUser(User user) {
////////		Session ses = HibernateUtil.getSession();
////////		
////////		try {
////////			ses.save(user);
////////			return true;
////////		} finally {
////////			HibernateUtil.closeSession();
////////		}
////////	}
////////
////////	public boolean updateUser(User user) {
////////		Session ses = HibernateUtil.getSession();
////////		
////////		Transaction t = ses.beginTransaction();
////////		
////////		try {
////////			ses.merge(user);
////////			t.commit();
////////			return true;
////////		} finally {
////////			HibernateUtil.closeSession();
////////		}
////////	}	
////////	
////////	public List<User> getAllUsers() {
////////		Session ses = HibernateUtil.getSession();
////////		
////////		List list = ses.createQuery("FROM User").list();
////////		
////////		return list;
////////	}
////////
////////	
////////	public User getUserById(int id) {
////////		Session ses = HibernateUtil.getSession();
////////		
////////		User user = ses.get(User.class, id);
////////		
////////		return user;
////////	}
////////
////////	public User getUserByUsername(String username) {
////////		Session ses = HibernateUtil.getSession();
////////		
////////		@SuppressWarnings("unchecked")
////////		List<User> list = ses.createQuery("FROM User WHERE userName = '"+username+"'").list();
////////		User user = list.get(0);
////////		
////////		return user;
////////	}
////////}
////////	//public boolean addUser11(User user) {
////////		// TODO Auto-generated method stub
////////	//	return false;
//////////	}
////////
////////	
//
//
//
//
//
//
//
//
////private static Logger log = Logger.getLogger(UserDAO.class);
////public List<User> getAll() {
////
////	List<User> users = new ArrayList<>();
////
////	try(Connection conn = ConnectionUtil.getConnection()) {
////
////		ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM \"Project1\".ers_users JOIN user_roles USING (role_id)");
////		users = this.mapResultSet(rs);
////
////	} catch (SQLException e) {
////		log.error(e.getMessage());
////	}
////
////	return users;
////}
////
////private List<User> mapResultSet(ResultSet rs) {
////	// TODO Auto-generated method stub
////	return null;
////}
////
////// Used to login
////public User getByCredentials(String username, String password) {
////
////	User user = new User();
////
////	try(Connection conn = ConnectionUtil.getConnection()) {
////
////		PreparedStatement ps = conn.prepareStatement("SELECT * FROM \"Prject1\".ers_users WHERE ers_username = ? AND ers_password = ?");
////
////		ps.setString(1, username);
////		ps.setString(2, password); // does this value correctly hold the encrypted password?
////
////		ResultSet rs = ps.executeQuery();
////		List<User> users = this.mapResultSet(rs);
////		
////		if (users.isEmpty()) user = null;
////		else user = users.get(0);
////
////	} catch (SQLException e) {
////		log.error(e.getMessage());
////	}
////
////	return user;
////}
////public User add(User newUser) {
////
////	try(Connection conn = ConnectionUtil.getConnection()) {
////
////		conn.setAutoCommit(false);
////
////		PreparedStatement ps = conn.prepareStatement("INSERT INTO \"Project1\".ers_users VALUES (0, ?, ?, ?, ?, ?, 1)", new String[] {"ers_users_id"});
////		ps.setString(1, newUser.getUsername());
////		ps.setString(2, newUser.getPassword());
////		ps.setString(3, newUser.getFirstname());
////		ps.setString(4, newUser.getLastname());
////		ps.setString(5, newUser.getEmail());
////
////		if(ps.executeUpdate() != 0) {
////
////			ResultSet rs = ps.getGeneratedKeys();
////
////			while(rs.next()) {
////				newUser.setId(rs.getInt(1));
////			}
////
////			conn.commit();
////		}
////
////	} catch (SQLIntegrityConstraintViolationException sicve) { 
////		sicve.printStackTrace();
////		log.warn("Username already taken.");
////	} catch (SQLException e) {
////		log.error(e.getMessage());
////	}
////
////	if(newUser.getId() == 0) return null;
////	return newUser;
////}
////
////public User getByUsername(String username) {
////
////	User user = null;
////
////	try(Connection conn = ConnectionUtil.getConnection()) {
////
////		PreparedStatement ps = conn.prepareStatement("SELECT * FROM \"Proect1\".ers_users JOIN ers_user_roles USING (user_role_id) WHERE username = ?");
////		ps.setString(1, username);
////
////		List<User> users = this.mapResultSet(ps.executeQuery());
////		if (!users.isEmpty()) user = users.get(0);
////
////	} catch (SQLException e) {
////		log.error(e.getMessage());
////	}
////
////	return user;
////}
////
////public User getById(int id) {
////
////	User user = new User();
////
////	try(Connection conn = ConnectionUtil.getConnection()) {
////
////		
////		PreparedStatement ps = conn.prepareStatement("SELECT * FROM \"Project1\".ers_users JOIN ers_user_roles USING (user_role_id) WHERE ers_users_id = ?");
////
////		ps.setInt(1, id);
////
////		ResultSet rs = ps.executeQuery();
////		List<User> users = this.mapResultSet(rs);
////		if (users.isEmpty()) user = null;
////		else user = users.get(0);
////
////	} catch (SQLException e) {
////		log.error(e.getMessage());
////	}
////
////	return user;
////}
////
////private List<User> mapResultSet1(ResultSet rs) throws SQLException {
////
////	List<User> users = new ArrayList<>();
////
////	while(rs.next()) {
////		User user = new User();
////		user.setId(rs.getInt("ers_users_id"));
////		user.setUsername(rs.getString("ers_username"));
////		user.setPassword(rs.getString("ers_password"));
////		user.setFirstname(rs.getString("user_first_name"));
////		user.setLastname(rs.getString("user_last_name"));
////		user.setEmail(rs.getString("user_email"));
////		user.setRole(rs.getString("user_role_id"));
////
////		users.add(user);
////	}
////	return users;
////}
////
////public User getUserByUsername(Object object) {
////	// TODO Auto-generated method stub
////	return null;
////}
////
////public List<User> getAllUsers() {
////	// TODO Auto-generated method stub
////	return null;
////}
////
////public User getUserById(int id) {
////	// TODO Auto-generated method stub
////	return null;
////}
////
////}
////