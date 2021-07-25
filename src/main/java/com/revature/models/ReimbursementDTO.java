package com.revature.models;

import java.sql.Timestamp;
import java.util.Objects;

public class ReimbursementDTO {
	
	public int reimb_id;
	public Timestamp reimb_amount;
	public int reimb_status_id;
	public int reimb_type_id;
	public String reimb_description;
	public ReimbursementDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReimbursementDTO(int reimb_id, Timestamp reimb_amount, int reimb_status_id, int reimb_type_id,
			String reimb_description) {
		super();
		this.reimb_id = reimb_id;
		this.reimb_amount = reimb_amount;
		this.reimb_status_id = reimb_status_id;
		this.reimb_type_id = reimb_type_id;
		this.reimb_description = reimb_description;
	}
	@Override
	public String toString() {
		return "ReimbursementDTO [reimb_id=" + reimb_id + ", reimb_amount=" + reimb_amount + ", reimb_status_id="
				+ reimb_status_id + ", reimb_type_id=" + reimb_type_id + ", reimb_description=" + reimb_description
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(reimb_amount, reimb_description, reimb_id, reimb_status_id, reimb_type_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReimbursementDTO other = (ReimbursementDTO) obj;
		return reimb_amount == other.reimb_amount && Objects.equals(reimb_description, other.reimb_description)
				&& reimb_id == other.reimb_id && reimb_status_id == other.reimb_status_id
				&& reimb_type_id == other.reimb_type_id;
	}
	
}
