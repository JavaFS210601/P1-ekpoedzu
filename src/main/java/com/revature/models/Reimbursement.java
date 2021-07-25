package com.revature.models;
import java.security.Timestamp;
import java.util.Objects;




public class Reimbursement {




//	public Reimbursement(int reimbId, double reimbAmount, java.sql.Timestamp submitted, Timestamp resolved,
//			String description, Employee reimbAuthorId, Employee reimbResolverId, ReimbursementStatus reimbStatusId,
//			ReimbursementType reimbTypeId) {
//		super();
		private int reimb_Id;
		private int reimb_amount; 
		private Timestamp reimb_submitted;
		private Timestamp reimb_resolved;
		private String reimb_description;
		private int reimb_author;
		private int reimb_resolver;
		private int reimb_status_id;
		private int reimb_type_id;
		
		public Reimbursement(int i, double rA, Object object, Object object2, String type, Object object3, Object object4, ReimbursementStatus nrs, ReimbursementType rtype, Object object5) {
			super();
			// TODO Auto-generated constructor stub
		}

		public Reimbursement(int reimb_Id, int reimb_amount, String string, String string2,
				String reimb_description, int reimb_author, int reimb_resolver, int reimb_status_id, int reimb_typeid) {
			super();
			this.reimb_Id = reimb_Id;
			this.reimb_amount = reimb_amount;
			this.reimb_submitted = reimb_submitted;
			this.reimb_resolved = reimb_resolved;
			this.reimb_description = reimb_description;
			this.reimb_author = reimb_author;
			this.reimb_resolver = reimb_resolver;
			this.reimb_status_id = reimb_status_id;
			this.reimb_type_id = reimb_type_id;
		}
		
		@Override
		public String toString() {
			return "Reimbursement [reimb_Id=" + reimb_Id + ", reimb_amount=" + reimb_amount + ", reimb_submitted="
					+ reimb_submitted + ", reimb_resolved=" + reimb_resolved + ", reimb_description="
					+ reimb_description + ", reimb_author=" + reimb_author + ", reimb_resolver=" + reimb_resolver
					+ ", reimb_status_id=" + reimb_status_id + ", reimb_typeid=" + reimb_type_id + "]";

		}
		
		@Override
		public int hashCode() {
			return Objects.hash(reimb_Id, reimb_amount, reimb_author, reimb_description, reimb_resolved, reimb_resolver,
					reimb_status_id, reimb_submitted, reimb_type_id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Reimbursement other = (Reimbursement) obj;
			return reimb_Id == other.reimb_Id && reimb_amount == other.reimb_amount
					&& reimb_author == other.reimb_author && Objects.equals(reimb_description, other.reimb_description)
					&& Objects.equals(reimb_resolved, other.reimb_resolved) && reimb_resolver == other.reimb_resolver
					&& reimb_status_id == other.reimb_status_id
					&& Objects.equals(reimb_submitted, other.reimb_submitted) && reimb_type_id == other.reimb_type_id;
		}

		
		
		public int getReimb_Id() {
			return reimb_Id;
		}

		public void setReimb_Id(int reimb_Id) {
			this.reimb_Id = reimb_Id;
		}

		public int getReimb_amount() {
			return reimb_amount;
		}

		public void setReimb_amount(int reimb_amount) {
			this.reimb_amount = reimb_amount;
		}

		public Timestamp getReimb_submitted() {
			return reimb_submitted;
		}

		public void setReimb_submitted(Timestamp reimb_submitted) {
			this.reimb_submitted = reimb_submitted;
		}

		public Timestamp getReimb_resolved() {
			return reimb_resolved;
		}

		public void setReimb_resolved(Timestamp reimb_resolved) {
			this.reimb_resolved = reimb_resolved;
		}

		public String getReimb_description() {
			return reimb_description;
		}

		public void setReimb_description(String reimb_description) {
			this.reimb_description = reimb_description;
		}

		public int getReimb_author() {
			return reimb_author;
		}

		public void setReimb_author(int reimb_author) {
			this.reimb_author = reimb_author;
		}

		public int getReimb_resolver() {
			return reimb_resolver;
		}

		public void setReimb_resolver(int reimb_resolver) {
			this.reimb_resolver = reimb_resolver;
		}

		public int getReimb_status_id() {
			return reimb_status_id;
		}

		public void setReimb_status_id(int reimb_status_id) {
			this.reimb_status_id = reimb_status_id;
		}

		public int getReimb_type_id() {
			return reimb_type_id;
		}

		public void setReimb_typeid(int reimb_typeid) {
			this.reimb_type_id = reimb_type_id;
		}

		
		}
		
		
		
		

	