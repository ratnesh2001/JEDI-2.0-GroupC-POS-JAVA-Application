package com.flipkart.client;

import java.util.Scanner;

public class CRSProfessorMenu {
	
	public void createMenu(String profID) {
		Scanner in = new Scanner(System.in);
		
		int input;
		while (CRSApplicationClient.loggedin) {
			System.out.println("--------------------------------");
			System.out.println("-------Professor Menu-----------");
			System.out.println("--------------------------------");
			System.out.println("1. view Courses");
			System.out.println("2. view Enrolled Students");
			System.out.println("3. add Grades");
			System.out.println("4. logout");
			System.out.println("--------------------------------");
			System.out.printf("Choose From Menu: ");
			
			input = in.nextInt();
			switch (input) {
			case 1:
				// getCourses(profID);
                System.out.println("1. view Courses");
				break;
			case 2:
				// viewEnrolledStudents(profID);
                System.out.println("2. view Enrolled Students");
				break;
			case 3:
				// addGrade(profID);
                System.out.println("3. add Grades");
				break;
			case 4:
				CRSApplicationClient.loggedin = false;
				return;
			default:
				System.out.println("Please select appropriate option...");
			}
		}
		in.close();
	}
				
}