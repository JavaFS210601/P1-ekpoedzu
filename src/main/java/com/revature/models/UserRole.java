package com.revature.models;

import java.util.List;

public class UserRole{
	private int user_role_id;
	private String userrole;
	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRole(String userrole) {
		super();
		this.userrole = userrole;
		this.userrole = userrole;
	}
	public UserRole(int int1, String string) {
		// TODO Auto-generated constructor stub
	}
	public int getUser_role_id() {
		return user_role_id;
	}
	public void setUseroleid(int user_role_id) {
		this.user_role_id = user_role_id;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	@Override
	public String toString() {
		return "UserRole [user_role_id=" + user_role_id + ", userrole=" + userrole + "]";
	}
	public void setUserRole_role(String string) {
		// TODO Auto-generated method stub
		
	}
	public List<UserRole> getAllUserRoles() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getString(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
	
















//	private static final long serialVersionUID = 1L;
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="user_role_id", nullable = false, unique = false)
//	private int roleId;
//	
//	@Column(name="user_role", nullable=false, unique = false)
//	private String role;
//	
//	public UserRole() {
//		super();
//	}
//
//	public UserRole(int roleId, String role, String string, String string2, String string3, String string4, int i) {
//		super();
//		this.roleId = roleId;
//		this.role = role;
//	}
//	
//	public UserRole(String role) {
//		super();
//		this.role = role;
//	}
//
//	public int getRoleId() {
//		return roleId;
//	}
//
//	public void setRoleId(int roleId) {
//		this.roleId = roleId;
//	}
//
//	public String getRole() {
//		return role;
//	}
//
//	public void setRole(String role) {
//		this.role = role;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;	result = prime * result + ((role == null) ? 0 : role.hashCode());
//		result = prime * result + roleId;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		UserRole other = (UserRole) obj;
//	if (role == null) {
//			if (other.role != null)
//				return false;
//		} else if (!role.equals(other.role))
//			return false;
//		if (roleId != other.roleId)
//			return false;
//		return true;
//	}
//
//	@Override
//	public String toString() {
//		return "UserRole [roleId=" + roleId + ", role=" + role + "]";
//	}
//
//	public List<UserRole> getAllUserRoles() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void setUserRole_role(String string) {
//		// TODO Auto-generated method stub
//		
//	}	
//	
//
//}
//
//
//
//
//
//
//
//
//



//private int ers_user_role_id;
//private String user_role;
//
//public UserRole() {
//	super();
//}
//
//public UserRole(int ers_user_role_id, String user_role) {
//	super();
//	this.ers_user_role_id = ers_user_role_id;
//	this.user_role = user_role;
//}
//
//public UserRole(String user_role) {
//	super();
//	this.user_role = user_role;
//}
//
//@Override
//public String toString() {
//	return "UserRole [ers_user_role_id=" + ers_user_role_id + ", user_role=" + user_role + "]";
//}
//
//@Override
//public int hashCode() {
//	return Objects.hash(ers_user_role_id, user_role);
//}
//
//@Override
//public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if (getClass() != obj.getClass())
//		return false;
//	UserRole other = (UserRole) obj;
//	return ers_user_role_id == other.ers_user_role_id && Objects.equals(user_role, other.user_role);
//}
//
//public int getErs_user_role_id() {
//	return ers_user_role_id;
//}
//
//public void setErs_user_role_id(int ers_user_role_id) {
//	this.ers_user_role_id = ers_user_role_id;
//}
//
//public String getUser_role() {
//	return user_role;
//}
//
//public void setUser_role(String user_role) {
//	this.user_role = user_role;
//}
//
//public int getUserRoleId() {
//	// TODO Auto-generated method stub
//	return 0;
//}
//
//public void setUserRoleId(int int1) {
//	// TODO Auto-generated method stub
//	
//}
//
//public void setUserRoleName(String string) {
//	// TODO Auto-generated method stub
//	
//}
//
//public String getUserRoleName() {
//	// TODO Auto-generated method stub
//	return null;
//}
//
