package com.flipkart.bean;

public class Student extends User {
	 private int studentId;
	 private String branch;
	 private int batch;
	 
	 public boolean changePassword() {
		 return true;
	 }
	 public boolean register() {
		 return true;
	 }
	 public boolean viewGradeCard(String newPassword) {
		 return true;
	 }
	}
