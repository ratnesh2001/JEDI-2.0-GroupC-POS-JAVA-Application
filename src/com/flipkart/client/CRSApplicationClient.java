package com.flipkart.client;

import java.util.Scanner;

public class CRSApplicationClient {
    static boolean loggedin = false;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		
		int userInput;	

		createMainMenu();
		userInput=sc.nextInt();
        try{
        while(userInput!=4)
		{
			switch(userInput)
			{	
				case 1:
					
                    loginUser();
					break;
				case 2:
					
                    registerStudent();
					break;	
				case 3:
					
                    updatePassword();
					break;
				default:
					System.out.println("Invalid Input");
			}
			createMainMenu();
			userInput=sc.nextInt();
		}
		}
		catch(Exception ex)
		{
			System.out.println("Error occured "+ex);
		}
		finally
		{
			sc.close();
		}

    }
    public static void createMainMenu()
	{
		System.out.println("----------Welcome to Course Management System---------");
		System.out.println("1. Login");
		System.out.println("2. Student Registration");
		System.out.println("3. Update password");
		System.out.println("4. Exit");
		System.out.println("Enter user input");
	}
    public static void loginUser()
	{
		
		Scanner in = new Scanner(System.in);

		String userId,password,role;
		
        System.out.println("-----------------Login------------------");
			System.out.println("Email:");
			userId = in.next();
			System.out.println("Password:");
			password = in.next();
            System.out.println("Role:");
			role = in.next();

			loggedin =  true;    
			
			if(loggedin)
			{
				 
				 
				switch(role) {
				case "Admin":
					System.out.println(" Login Success");
                    
					CRSAdminMenu adminMenu = new CRSAdminMenu();
					adminMenu.createMenu();
					break;
				case "Professor":
					System.out.println("Login Success");
					CRSProfessorMenu professorMenu=new CRSProfessorMenu();
					professorMenu.createMenu(userId);
                   
					
					break;
				case "Student":
					
					
					boolean isApproved=true; 
					if(isApproved) {
						
						CRSStudentMenu studentMenu=new CRSStudentMenu();
						studentMenu.create_menu();
                        System.out.println("StudentMenu");
						
					} else {
						System.out.println("Failed to login, you have not been approved by the administration!");
						loggedin=false;
					}
					break;
				}
				
				
			}
			else
			{
				System.out.println("Invalid Credentials!");
			}
			
		}

        public static void registerStudent()
        {
            Scanner sc=new Scanner(System.in);
    
            String userId,name,password,address;
            
                
                System.out.println("---------------Student Registration-------------");
                System.out.println("Name:");
                name=sc.nextLine();
                System.out.println("Email:");
                userId=sc.next();
                System.out.println("Password:");
                password=sc.next();
                //
                System.out.println("Done");

        }   
        
        public static void updatePassword() {
            Scanner in = new Scanner(System.in);
            String userId,oldPassword,newPassword;

                System.out.println("------------------Update Password--------------------");
                System.out.println("Email");
                userId=in.next();
                System.out.println("Old Password:");
                oldPassword=in.next();     
                System.out.println("New Password:");
                newPassword=in.next();
                
                    System.out.println("Password updated successfully!");
    
            
        }
    
		
}