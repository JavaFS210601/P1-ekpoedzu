package com.revature.models;

public interface ReimbursementTypeInterface {

	ReimbursementType getReimbursementTypeByType(String name);

	ReimbursementType getReimbursementTypeByType(String type, Object id);

}
