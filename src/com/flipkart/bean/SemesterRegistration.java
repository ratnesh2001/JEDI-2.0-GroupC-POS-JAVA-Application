/**
 * 
 */
package com.flipkart.bean;

import java.util.Date;

/**
 * @author ratnesh.khandelwal
 *
 */
public class SemesterRegistration extends Course{
    private int studentId;
    private int semester;
    private Date dateOfRegistration;
    
    public boolean registerCourses() {
    	return true;
    }
    
    public boolean addCourses() {
    	return true;
    }
    
    public boolean dropCourse() {
    	return true;
    }
    
    public boolean payFees() {
    	return true;
    }
    
    public boolean viewRegisteredCourses() {
    	return true;
    }
    
}
