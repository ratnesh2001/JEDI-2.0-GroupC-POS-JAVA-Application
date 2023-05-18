/**
 * 
 */
package com.flipkart.bean;

/**
 * @author ratnesh.khandelwal
 *
 */
public class RegisteredCourse {
	private String courseCode;
	private int semester;
	private int studentId;
	private String grade;
    
	public boolean dropCourse() {
    	return true;
    }
    
	public boolean viewGrade() {
    	return true;
    }
    
}