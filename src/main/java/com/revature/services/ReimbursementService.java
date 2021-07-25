package com.revature.services;

import java.sql.Timestamp;
import java.util.List;

import com.revature.dao.ReimbursementDAO;
import com.revature.dao.ReimbursementDAOInterface;
import com.revature.models.Reimbursement;

public class ReimbursementService {
	//instantiate 
			private ReimbursementDAOInterface ReimbDAO = new ReimbursementDAO();
			
			//create a method that sends the DAO data up to the controller (this method will be called by the controller)
			public List<Reimbursement> getAllReimbursement() {
				return ReimbDAO.getAllReimbursement();
			}
			
//			public  List<Reimbursement> getEmployeeReimbursements(){
//				
//					return ReimbursementDAO.getEmployeeReimbursements();
//				
//			}
			
			public void addReimbursement_Request(int reimb_type_id, int reimb_amount, String reimb_description) {
				
				if(reimb_type_id >= 1 && reimb_type_id <= 4) {
					ReimbursementDAO reimbursementDAO = new ReimbursementDAO();
					reimbursementDAO.addReimbursement_Request(reimb_type_id, reimb_amount, reimb_description);
				}else {
					System.out.println("oof");
				}
			}
			
			public void acceptDenyReimbursement(int reimb_type_id, int reimb_status_id) {
				if(reimb_status_id >= 1 && reimb_status_id <= 3) {
					ReimbursementDAO reimbursementDAO = new ReimbursementDAO();
					reimbursementDAO.acceptDenyReimbursement(reimb_type_id, reimb_status_id);
				}else {
					System.out.println("NA");
				}
			}

			public void addReimbursement_Request(int reimb_type_id, Timestamp reimb_amount, String reimb_description) {
				// TODO Auto-generated method stub
				
			}

			public List<Reimbursement> getEmployeeReimbursements() {
				// TODO Auto-generated method stub
				return null;
			}
}










