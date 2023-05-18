package com.flipkart.client;
import java.util.Scanner;

public class CRSStudentMenu {
    Scanner sc = new Scanner(System.in);
    public void create_menu(){
        while(CRSApplicationClient.loggedin){ 
        System.out.println("***********");
        System.out.println("***Student Menu****");
        System.out.println("***********");
        System.out.println("1. Course Registration");
        System.out.println("2. Add Course");
        System.out.println("3. Drop Course");
        System.out.println("4. View Course");
        System.out.println("5. View Registered Courses");
        System.out.println("6. View grade card");
        System.out.println("7. Make Payment");
        System.out.println("8. Logout");
        System.out.println("***********");
    
        int choice = sc.nextInt();
    
        switch (choice) {
        
        case 1: 
           
            System.out.println("1. Course Registration");
            break;
            
        case 2:
          
            System.out.println("2. Add Course");
            break;
            
        case 3:
            //dropCourse(studentId);
            System.out.println("3. Drop Course");

            break;
            
        case 4:
            // viewCourse(studentId);
            System.out.println("4. View Course");
            break;
            
        case 5:
            // viewRegisteredCourse(studentId);
            System.out.println("5. View Registered Courses");
            break;
            
        case 6:
            // viewGradeCard(studentId);
            System.out.println("6. View grade card");
            break;
            
        case 7:
            // make_payment(studentId);
            System.out.println("7. Make Payment");

            break;
            
        case 8:
            CRSApplicationClient.loggedin = false;
            break;			
            
        default:
            System.out.println("Incorrect Choice!");

    }
    }
    }
}