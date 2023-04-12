package utility;

import model.*;
import controller.*;
import utility.*;

public class ConsolePrinter {
	
	public static void displayMenu() {
		System.out.println(ColorsUtility.ANSI_CYAN + "+---------------------------+");
		System.out.println("| 1. CREATE YOUR ACCOUNT    |");
		System.out.println("| 2. LOGIN                  |");
		System.out.println("| 3. VIEW MOVIES            |");
		System.out.println("| 4. EXIT                   |");
		System.out.println("+---------------------------+");
		System.out.println();
	}
	
	public static void createAccount(int i) {
		if(i==1) {
			System.out.println(ColorsUtility.ANSI_CYAN+ "+-------------------------------+");
			System.out.println("| Enter Details For New Account |");
			System.out.println("+-------------------------------+");
			System.out.println("Email: ");
			
		}
		else if(i==2) {
			System.out.println("Password: ");
		}
		else if(i==3) {
			System.out.println("Confirm Password: ");	
		}
	}
	
	public static void Login(int i) {
		if(i==1) {
			System.out.println(ColorsUtility.ANSI_CYAN+ "+---------------------+");
			System.out.println("| Enter Login Details |");
			System.out.println("+---------------------+");
			System.out.println("Email: ");
		}
		else if(i==2) {
			System.out.println("Password: ");
		}
	}

	public static void loggedIn() {
		System.out.println(ColorsUtility.ANSI_CYAN + "+---------------------------+");
		System.out.println("| Movie  Avg Rating # of Ratings|");
		System.out.println("| 1. CREATE YOUR ACCOUNT    |");
		System.out.println("| 2. LOGIN                  |");
		System.out.println("| 3. VIEW MOVIES            |");
		System.out.println("| 4. EXIT                   |");
		System.out.println("+---------------------------+");
		System.out.println();
	}
	
	public static void ratingMenu() {
		
	}
	
	public static void viewMovies() {
	}
	
	public static void errorOutput(int i) {
		System.out.print(ColorsUtility.ANSI_RED);
		if(i==1) {
			System.out.println("Invalid Input. Try Again!"+ ColorsUtility.ANSI_RED);
		}
		else if(i==2) {
			System.out.println("Invalid Email Address! Email must be 5 characters long and must contain a @."+ ColorsUtility.ANSI_RED);
		}
		else if(i==3) {
			System.out.println("Password must be atleast 8 characters long, possess an upper case character, possess a lower case character and possess a special character! Please enter a new one: "+ ColorsUtility.ANSI_RED);
		}
		else if(i==4) {
			System.out.println("Your Passwords Don't Match!"+ ColorsUtility.ANSI_RED);
		}
		else if(i==5) {
			System.out.println("Invalid Credentials! Try Again!"+ ColorsUtility.ANSI_RED);
		}
	}
}
