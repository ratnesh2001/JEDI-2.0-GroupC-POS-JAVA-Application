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
	
	private int semester;
	private float Cp1;
    private List<String> registeredCourses;
    
    public boolean calculateCpi() {
    	return true;
    }

	
}
