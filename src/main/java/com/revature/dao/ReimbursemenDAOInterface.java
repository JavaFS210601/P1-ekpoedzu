package com.revature.dao;

public interface ReimbursemenDAOInterface {

	ReimbursementDAOInterface getReimbursemntBy(int author);

	ReimbursementDAOInterface getReimbursemntBy(int author, String reimb_author);

}
