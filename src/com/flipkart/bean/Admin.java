/**
 * 
 */
package com.flipkart.bean;

/**
 * @author ratnesh.khandelwal
 *
 */
public class Admin extends User{
	private String DOJ;
	
	public boolean addProfessor() {
		return true;
		
	}
	
	public boolean assignCourse() {
		return true;
	}
	
	public boolean approveStudent() {
		return true;
	}
}
