package application;

import java.util.Scanner;

import model.*;
import utility.*;
import controller.*;

public class MovieRatingApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean runApp = true;
		MovieController mc = new MovieController();
		
		while(runApp) {
			ConsolePrinter.displayMenu();
			try {
				int choice = Integer.parseInt(scan.nextLine());
				switch(choice) {
					case 1:
						ConsolePrinter.createAccount(1);
						String email = scan.nextLine();
						
						ConsolePrinter.createAccount(2);
						String password = scan.nextLine();
						
						ConsolePrinter.createAccount(3);
						String cPassword = scan.nextLine();
						
						if(mc.isEmailValid(email)) {
							if(mc.isPassValid(password)) {
								if(mc.isPasswordSame(password, cPassword)) {
									mc.addAccount(email,password);
									System.out.println("Account Created!");
									break;
								}else {
									ConsolePrinter.errorOutput(4);	
								}
							}else{
								ConsolePrinter.errorOutput(3);
							}
						}else {
							ConsolePrinter.errorOutput(2);
						}
						break;
						
					case 2:
						ConsolePrinter.Login(1);
						String accountEmail = scan.nextLine();
						ConsolePrinter.Login(2);
						String accountPassword = scan.nextLine();
						
						if(mc.doesAccountEmailExist()) {
							if(mc.doesAccountPasswordExist()) {
								
							}
						}else {
							ConsolePrinter.errorOutput(1);
						}
						
						break;
						
					case 3:
						ConsolePrinter.viewMovies();
						break;
						
					case 4:
						runApp = false;
						System.out.println("Thank you for using the MovieRating Application! Goodbye!");
						break;
				}
				
			}
			catch(Exception e) {
				System.out.println(ColorsUtility.ANSI_RED + "Invalid Input. Try Again!" +ColorsUtility.ANSI_CYAN);
			}
		}
		
		scan.close();
	}

}
