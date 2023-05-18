/**
 * 
 */
package com.flipkart.bean;

import java.util.List;

/**
 * @author ratnesh.khandelwal
 *
 */
public class GradeCard {
	private int studentid;
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public float getCp1() {
		return Cp1;
	}
	public void setCp1(float cp1) {
		Cp1 = cp1;
	}
	public List<String> getRegisteredCourses() {
		return registeredCourses;
	}
	public void setRegisteredCourses(List<String> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	private int semester;
	private float Cp1;
    private List<String> registeredCourses;
    
    

	
}
