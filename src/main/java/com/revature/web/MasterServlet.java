
package com.revature.web;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.revature.controllers.LoginController;
import com.revature.controllers.ManagerController;
import com.revature.controllers.ReimbursementController;
import com.revature.controllers.ReimbursementStatusControllerInterface;
import com.revature.controllers.ReimbursementTypeController;
import com.revature.controllers.UserController;
import com.revature.controllers.UserRoleController;


//this is where all requests for the web application are handled

//rememebr, this is our front controller - ALL requests that come in will have to hit this first.
	@WebServlet("/nameURL")
public class MasterServlet extends HttpServlet {
		//instantiate objects
		private UserRoleController urc = new UserRoleController();
		private ReimbursementStatusControllerInterface rsc = new ReimbursementController();
		private ReimbursementTypeController rtc = new ReimbursementTypeController();
		private UserController uc = new UserController();
		private ReimbursementController rc = new ReimbursementController();
		private LoginController LoginController = new LoginController();
		private ManagerController ManagerLoginController = new ManagerController();
		//private Object ReimbursementTypeController;
		


		protected <rsc> void doGet(HttpServletRequest req, HttpServletResponse res, Object ReimbursementStatusController) throws ServletException, IOException {
			res.setContentType("application/json"); //set the content of our response object to be JSON
			
			res.setStatus(404);
			
			//Now we want to write some code that will determine where requests get sent.
			
			String URI = req.getRequestURI().replace("/P1-ekpoedzu/", "");
			//getting the request URI, and stripping out the base URL
			//so we'll just be left with the endpoint (e.g. "avengers", "login") to use in a switch
			
			switch(URI) {
			case "employeeLogin": 
				LoginController.login(req, res);
				break;
				
			case "managertLogin":
				ManagerLoginController.login(req, res);
				break;
				
			case "getEmployeeReimbursements":
				rc.getEmployeeReimbursements(res);
				break;
				
			case "addReimbursement_Request":
				ReimbursementController.addReimbursement_Request(req, res);
				break;
				
				
			case "acceptDenyReimbursement":
				rc.acceptDenyReimbursement(req, res);
				break;
				
				
			case "ers1": 
				uc.getAllUsers((HttpServletResponse) uc);
				break;
			case "ers2": //test case for userroles table
				UserRoleController.getAllUserrole(urc);
				break;
			case "ers3": //test case for reimbursementstatus
				rsc.getAllReimbursementStatus(rsc);
				break;
			case "ers4": //test case for ers_reimbursement_type
				ReimbursementTypeController.getAllReimbursementType(rtc);
				break;
			case "ers5": //test case for ers_reimbursement
				rc.getAllErs_Reimbursement(res);
				break;
			}
		}
		
		
		
			
			//doGet(req, res);
			//this sends every POST request to the doGet method, why???
			//I only want one switch statement in this Servlet. It can get very messy otherwise
			//and we'll differentiate get from post in the controllers instead of the servlet.
			
		}
		
	