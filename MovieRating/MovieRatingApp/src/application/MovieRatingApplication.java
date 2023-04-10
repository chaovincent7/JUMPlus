package application;

import java.util.Scanner;

import model.*;
import utility.*;

public class MovieRatingApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean runApp = true;
		
		while(runApp) {
			ConsolePrinter.displayMenu();
			try {
				int choice = Integer.parseInt(scan.nextLine());
				switch(choice) {
					case 1:
						ConsolePrinter.createAccount();
						break;
					case 2:
						ConsolePrinter.Login();
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
