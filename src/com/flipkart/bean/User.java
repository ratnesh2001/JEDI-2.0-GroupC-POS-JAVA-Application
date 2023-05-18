/**
 * 
 */
package com.flipkart.bean;

/**
 * @author ratnesh.khandelwal
 *
 */
public class User {
	
	private int userId;
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	private String name;
	private String role;
	
	public boolean updateDetails(int userID, String Name, String Role) {
		this.name = Name;
		this.role = Role;
		
		System.out.println("update details of the user");
		return true;
	}
	
	public boolean updatePassword() {
		System.out.println("update details of the user");
		return true;
		
	}

}
