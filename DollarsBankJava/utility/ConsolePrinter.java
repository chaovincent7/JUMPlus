package DollarsBankJava.utility;

public class ConsolePrinter {

    // Inital Interface
    public static void displayMenu() {
        System.out.println(Colors.ANSI_BLUE + "+---------------------------+");
        System.out.println("| DOLLARSBANK Welcomes You! |");
        System.out.println("+---------------------------+" + Colors.ANSI_DEFAULT);
        System.out.println("1. Create New Account");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.println();
        System.out.println(Colors.ANSI_GREEN + "Enter Choice (1, 2 or 3) :" + Colors.ANSI_DEFAULT);
    }

    // Create Account Menu
    public static void SignUp(int i) {
        if (i == 1) {
            System.out.println(Colors.ANSI_BLUE + "+-------------------------------+");
            System.out.println("| Enter Details For New Account |");
            System.out.println("+-------------------------------+" + Colors.ANSI_DEFAULT);
            System.out.println("Customer Name: ");
        } else if (i == 2) {
            System.out.println("Customer Address: ");
        } else if (i == 3) {
            System.out.println("Customer Contact Number: ");
        } else if (i == 4) {
            System.out.println("User ID: ");
        } else if (i == 5) {
            System.out.println("Password: 8 Characters With Lower, Upper & Special  ");
        } else if (i == 6) {
            System.out.println("Initial Deposit Amount: ");
        }
    }

    // Login Menu
    public static void Login(int i) {
        if (i == 1) {
            System.out.println(Colors.ANSI_BLUE + "+---------------------+");
            System.out.println("| Enter Login Details |");
            System.out.println("+---------------------+" + Colors.ANSI_DEFAULT);
            System.out.println("User Id: ");
        } else if (i == 2) {
            System.out.println("Password: ");
        }
    }

    // Welcome Menu
    public static void LoggedIn() {
        System.out.println(Colors.ANSI_BLUE + "+---------------------+");
        System.out.println("| WELCOME Customer!!! |");
        System.out.println("+---------------------+" + Colors.ANSI_DEFAULT);
        System.out.println("1. Deposit Amount");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Funds Transfer");
        System.out.println("4. View 5 Recent Transactions");
        System.out.println("5. Display Customer Information");
        System.out.println("6. Sign Out");
        System.out.println();
        System.out
                .println(Colors.ANSI_GREEN + "Enter Choice (1, 2, 3, 4, 5 or 6) :" + Colors.ANSI_DEFAULT);
    }

    // Deposit Menu
    public static void Deposit(int i) {
        if (i == 1) {
            System.out.println(Colors.ANSI_BLUE + "+------------------+");
            System.out.println("| Deposit Details: |");
            System.out.println("+------------------+" + Colors.ANSI_DEFAULT);
            System.out.println("Please Enter The Amount You Wish To Deposit:");
        } else if (i == 2) {
            System.out.print("Deposit Successful! Current Balance is now: $");
        } else if (i == 3) {
            System.out.println(Colors.ANSI_RED
                    + "Deposit Unsuccessful! Cannot enter an amount that is less than or equal to zero!"
                    + Colors.ANSI_DEFAULT);
        } else if (i == 4) {
            System.out.println(Colors.ANSI_RED + "Invalid Deposit Amount!" + Colors.ANSI_DEFAULT);
        }
    }

    // Withdraw Menu
    public static void Withdraw(int i) {
        if (i == 1) {
            System.out.println(Colors.ANSI_BLUE + "+---------------------+");
            System.out.println("| Withdrawal Details: |");
            System.out.println("+---------------------+" + Colors.ANSI_DEFAULT);
            System.out.println("Please Enter The Amount You Wish To Withdraw:");
        } else if (i == 2) {
            System.out.print("Withdrawal Successful! Current Balance is now: $");
        } else if (i == 3) {
            System.out.println(
                    Colors.ANSI_RED + "Withdrawal Unsuccessful! Current Balance is less than desired amount!"
                            + Colors.ANSI_DEFAULT);
        } else if (i == 4) {
            System.out.println(Colors.ANSI_RED + "Invalid Withdrawal Amount!" + Colors.ANSI_DEFAULT);
        } else if (i == 5) {
            System.out.println(Colors.ANSI_RED
                    + "Withdrawal Unsuccessful! Cannot withdraw an amount that is less than or equal to zero!"
                    + Colors.ANSI_DEFAULT);
        }
    }

    // Transfer Menu
    public static void Transfer(int i) {
        if (i == 1) {
            System.out.println(Colors.ANSI_BLUE + "+-------------------------+");
            System.out.println("| Funds Transfer Details: |");
            System.out.println("+-------------------------+" + Colors.ANSI_DEFAULT);
            System.out.println("Please Enter The User Id of the person you wish to send money to:");
        } else if (i == 2) {
            System.out.println("Please enter the amount of money you wish to send:");
        } else if (i == 3) {
            System.out.println(Colors.ANSI_RED + "Invalid User Id entered! " + Colors.ANSI_DEFAULT);
        } else if (i == 4) {
            System.out.print("Money Transfer Successful! Current Balance is now: $");
        } else if (i == 5) {
            System.out.println(Colors.ANSI_RED + "Invalid Transfer Amount!" + Colors.ANSI_DEFAULT);
        } else if (i == 6) {
            System.out.println(Colors.ANSI_RED
                    + "Invalid Transfer Amount! Cannot transfer an amount that is less than or equal to zero!"
                    + Colors.ANSI_DEFAULT);
        } else if (i == 7) {
            System.out.println(
                    Colors.ANSI_RED + "Invalid Transfer Amount! Current Balance is less than desired amount!"
                            + Colors.ANSI_DEFAULT);
        }
    }

    // Error Handling
    public static void errorOutput(int i) {
        System.out.print(Colors.ANSI_RED);
        if (i == 1) {
            System.out.println("Invalid Input. Try Again!" + Colors.ANSI_DEFAULT);
        } else if (i == 2) {
            System.out.println(
                    "Password must be atleast 8 characters long, possess an upper case character, possess a lower case character and possess a special character! Please enter a new one: "
                            + Colors.ANSI_DEFAULT);
        } else if (i == 3) {
            System.out.println(
                    "You have entered an initial deposit amount which is either 0 or less than zero. Please enter a positive value."
                            + Colors.ANSI_DEFAULT);
        } else if (i == 4) {
            System.out.println("Invalid Credentials! Try Again!" + Colors.ANSI_DEFAULT);
        } else if (i == 5) {
            System.out.println("User Id Unavailable. Please Enter A New One!" + Colors.ANSI_DEFAULT);
        } else if (i == 6) {
            System.out.println("Phone numbers must possess 10 digits!" + Colors.ANSI_DEFAULT);
        }
    }

}