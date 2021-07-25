package com.revature.dao;

import java.util.List;

import com.revature.models.Reimbursement;

public interface ReimbursementDAOInterface {

	void setReimbId(int int1);

	void setAmount(double double1);

	void setSubmitted(String string);

	void setResolved(String string);

	void setDesc(String string);

	void setAuthor(int int1);

	void setResolver(int int1);

	void setStatusId(int int1);

	void setTypeId(int int1);

	double getAmount();

	String getSubmitted();

	String getDesc();

	int getAuthor();

	int getTypeId();

	String getResolved();

	int getReceipt();

	int getStatusId();

	int getReimb_resolver();

	int getReimb_id();

	void setDescription(String string);

	List<Reimbursement> getAllReimbursements();

	List<Reimbursement> getEmployeeReimbursements();

	List<Reimbursement> getAllReimbursement();

	void addReimbursement_Request(int reimb_type_id, int reimb_amount, String reimb_description);

	void acceptDenyReimbursement(int reimb_type_id, int reimb_status_id);

}
