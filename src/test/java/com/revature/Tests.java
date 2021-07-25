//package com.revature;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertNull;
//import static org.junit.Assert.assertTrue;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.junit.Test;
//import com.revature.controllers.LoginController;
//import com.revature.controllers.ManagerController;
//import com.revature.controllers.ReimbursementController;
//import com.revature.controllers.ReimbursementStatusControllerInterface;
//import com.revature.controllers.ReimbursementTypeController;
//import com.revature.controllers.UserController;
//import com.revature.controllers.UserRoleController;
//import com.revature.dao.ReimbursementDAO;
//import com.revature.dao.UserDAO;
//import com.revature.services.LoginService;
//
//public class Tests {
//	 UserRoleController urc = new UserRoleController();
//	 ReimbursementStatusControllerInterface rsc = new ReimbursementController();
//	 ReimbursementTypeController rtc = new ReimbursementTypeController();
//	 UserController uc = new UserController();
//	ReimbursementController rc = new ReimbursementController();
//	 LoginController LoginController = new LoginController();
//	 ManagerController ManagerController = new ManagerController();
//	
//	
//
//	//1
//	@Test //recognizes this method as a testing method
//	public void testUserDaoHashCode()
//	{
//		System.out.println("Testing valid login");
//		
//		assertNotNull(UserDAO.hashCode());
//	}
//	
//	//2
//	@Test //recognizes this method as a testing method
//	public void testUsersDaoHashCode2()
//	{
//		System.out.println("Testing valid login");
//		
//		assertNull(UserDAO.hashCode());
//	}
//	
//	//3
//	@Test //recognizes this method as a testing method
//	public void testReimbursement_AO()
//	{
//		System.out.println("Testing valid login");
//		
//		assertNotNull(ReimbursementDAO.hashCode());
//	}
//
//	//4
//	@Test //recognizes this method as a testing method
//	public void testReimbursementDAO2()
//	{
//		System.out.println("Testing valid login");
//			
//		assertNull(ReimbursementDAO.hashCode());
//	}
//	
//	//5
//	@Test //recognizes this method as a testing method
//	public void testReimbursementStatusDAO()
//	{
//		System.out.println("Testing valid login");
//			
//		assertNotNull(ReimbursementStatusDAO.hashCode());
//	}
//	
//	//6
//	@Test //recognizes this method as a testing method
//	public void testReimbursementStatusDAO2()
//	{
//		System.out.println("Testing valid login");
//			
//		assertNull(ReimbursementStatusDAO.hashCode());
//	}
//	
//	//7
//	@Test //recognizes this method as a testing method
//	public void testReimbursementTypeDAO()
//	{
//		System.out.println("Testing valid login");
//			
//		assertNotNull(ReimbursementTypeDAO.hashCode());
//	}
//	
//	//8
//	@Test //recognizes this method as a testing method
//	public void testReimbursementTypeDAO2()
//	{
//		System.out.println("Testing valid login");
//			
//		assertNull(ReimbursementTypeDAO.hashCode());
//	}
//	
//	//9
//	@Test //recognizes this method as a testing method
//	public void testLoginController()
//	{
//		System.out.println("Testing valid login");
//			
//		assertNotNull(LoginController.hashCode());
//	}
//	
//	private void assertNotNull(int hashCode) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	//10
//	@Test //recognizes this method as a testing method
//	public void testEmployeeLoginController2()
//	{
//		System.out.println("Testing valid login");
//			
//		assertNull(LoginController.hashCode());
//	}
//}
//
//	
//	
//
//	
//	
////	//this is a placeholder test class - feel free to delete or rename it
////	LoginService ls = new LoginService();
////
////	@Test //we need the @Test annotation in order for this to be recognized as a testing method
////	public void testValidLogin() {
////		System.out.println("TESTING VALID LOGIN...");
////
////		assertTrue(ls.login("demoMan", "password"));
////	}
////
////	@Test //we need the @Test annotation in order for this to be recognized as a testing method
////	public void testInvalidLogin() {
////		System.out.println("TESTING INVALID LOGIN...");
////
////		assertFalse(ls.login("sadfadsfdsfaf", "gdfgfddsfas"));
////	}
//
//
//
//
//
//
