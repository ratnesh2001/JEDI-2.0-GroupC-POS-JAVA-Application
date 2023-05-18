/**
 * 
 */
package com.flipkart.client;

/**
 * @author ratnesh.khandelwal
 *
 */
public class CRSApplicationCleint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean verifyUser(int userID, String Name, String Role) {
			int roleID = getRole(Role);
			
			if(roleID == 1) {
				student();
			}
			else if(roleID == 2) {
				professor();
			}
			else {
				admin();
			}
			
			return true;
		}

	}

	private static void admin() {
		// TODO Auto-generated method stub
		
	}

	private static void professor() {
		// TODO Auto-generated method stub
		
	}

	private static void student() {
		// TODO Auto-generated method stub
		
	}

	public int getRole(String Role) {
		if(Role=="Student") return 1;
		else if(Role == "Professor") return 2;
		else return 3;
	}

}
