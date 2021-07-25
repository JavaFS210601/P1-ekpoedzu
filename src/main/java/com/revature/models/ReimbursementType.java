package com.revature.models;

import java.util.Objects;

public class ReimbursementType implements ReimbursementTypeInterface{
	private int reimb_type_id;
	private String reimb_type;

	public ReimbursementType() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ReimbursementType getReimbursementTypeByType(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReimbursementType getReimbursementTypeByType(String type, Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ReimbursementType(int reimb_type_id, String reimb_type) {
		super();
		this.reimb_type_id = reimb_type_id;
		this.reimb_type = reimb_type;
	}

	@Override
	public String toString() {
		return "ReimbursementType [reimb_type_id=" + reimb_type_id + ", reimb_type=" + reimb_type + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(reimb_type, reimb_type_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReimbursementType other = (ReimbursementType) obj;
		return Objects.equals(reimb_type, other.reimb_type) && reimb_type_id == other.reimb_type_id;
	}

	public int getReimb_type_id() {
		return reimb_type_id;
	}

	public void setReimb_type_id(int reimb_type_id) {
		this.reimb_type_id = reimb_type_id;
	}

	public String getReimb_type() {
		return reimb_type;
	}

	public void setReimb_type(String reimb_type) {
		this.reimb_type = reimb_type;
	}

	public void setReimbursementType_type(String type) {
		// TODO Auto-generated method stub
		
	}

	public void setReimbursementType_id(Object id) {
		// TODO Auto-generated method stub
		
	}
	
	
}




	
	
	
