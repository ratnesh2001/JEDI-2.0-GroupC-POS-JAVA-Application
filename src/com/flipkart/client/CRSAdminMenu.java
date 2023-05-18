package com.flipkart.client;
import java.util.Scanner;

public class CRSAdminMenu {
    Scanner sc = new Scanner(System.in);
    
    public void createMenu(){
        while(CRSApplicationClient.loggedin){ 
        System.out.println("***********");
        System.out.println("***Admin Menu****");
        System.out.println("***********");
        System.out.println("1. View course in catalog");
        System.out.println("2. Add Course to catalog");
        System.out.println("3. Delete Course from catalog");
        System.out.println("4. Approve Students");
        System.out.println("5. View Pending Approvals");
        System.out.println("6. Add Professor");
        System.out.println("7. Assign Professor To Courses");
        System.out.println("8. Generate Report Card");
        System.out.println("9. Logout");
        System.out.println("***********");

        int choice = sc.nextInt();
    
        switch (choice) {
        
        case 1: 
            // registerCourses(studentId);
            System.out.println("1. View course in catalog");
            break;
            
        case 2:
            //addCourse(studentId);
            System.out.println("2. Add Course to catalog");
            break;
            
        case 3:
            //dropCourse(studentId);
            System.out.println("3. Delete Course from catalog");

            break;
            
        case 4:
            // viewCourse(studentId);
            System.out.println("4. Approve Students");
            break;
            
        case 5:
            // viewRegisteredCourse(studentId);
            System.out.println("5. View Pending Approvals");
            break;
            
        case 6:
            // viewGradeCard(studentId);
            System.out.println("6. Add Professor");
            break;
            
        case 7:
            // make_payment(studentId);
            System.out.println("7. Assign Professor To Courses");
            break;
            
        case 8:
             System.out.println("8. Generate Report Card");
             break;
        case 9:
             CRSApplicationClient.loggedin = false;
             return;

        default:
            System.out.println("Incorrect Choice!");
        
        }
    }
    

    }
}