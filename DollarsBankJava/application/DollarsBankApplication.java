package DollarsBankJava.application;

import java.util.Scanner;

import DollarsBankJava.controller.*;
import DollarsBankJava.model.*;
import DollarsBankJava.utility.*;

public class DollarsBankApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DollarsBankController dbc = new DollarsBankController();
        boolean runApp = true;
        while (runApp) {
            ConsolePrinter.displayMenu();
            try {
                int choice = Integer.parseInt(scan.nextLine());
                // Create New Account
                if (choice == 1) {
                    ConsolePrinter.SignUp(1);
                    System.out.print(Colors.ANSI_CYAN);
                    String cust_name = scan.nextLine();
                    System.out.print(Colors.ANSI_DEFAULT);
                    ConsolePrinter.SignUp(2);
                    System.out.print(Colors.ANSI_CYAN);
                    String cust_address = scan.nextLine();
                    System.out.print(Colors.ANSI_DEFAULT);
                    String phone_num = "";
                    while (true) {
                        ConsolePrinter.SignUp(3); // contact #
                        System.out.print(Colors.ANSI_CYAN);
                        phone_num = scan.nextLine();
                        if (dbc.validnum(phone_num)) {
                            break;
                        } else {
                            System.out.print(Colors.ANSI_DEFAULT);
                            ConsolePrinter.errorOutput(6);
                        }
                    }

                    System.out.print(Colors.ANSI_DEFAULT);

                    String uid = "";
                    while (true) {
                        ConsolePrinter.SignUp(4);
                        System.out.print(Colors.ANSI_CYAN);
                        uid = scan.nextLine();
                        if (!dbc.checkUserId(uid)) {
                            System.out.print(Colors.ANSI_DEFAULT);
                            ConsolePrinter.errorOutput(5);
                        } else {
                            break;
                        }
                    }
                    System.out.print(Colors.ANSI_DEFAULT);

                    String pw;
                    while (true) {
                        ConsolePrinter.SignUp(5);
                        System.out.print(Colors.ANSI_CYAN);
                        pw = scan.nextLine();
                        if (!dbc.checkPassValid(pw)) {
                            System.out.print(Colors.ANSI_DEFAULT);
                            ConsolePrinter.errorOutput(2);
                        } else {
                            break;
                        }
                    }

                    System.out.print(Colors.ANSI_DEFAULT);

                    double initial_balance;
                    while (true) {
                        ConsolePrinter.SignUp(6);
                        System.out.print(Colors.ANSI_CYAN);
                        try {
                            initial_balance = Double.parseDouble(scan.nextLine());
                            if (initial_balance > 0) {
                                break;
                            } else if (initial_balance <= 0) {
                                System.out.print(Colors.ANSI_DEFAULT);
                                ConsolePrinter.errorOutput(3);
                            } else {
                                System.out.print(Colors.ANSI_DEFAULT);
                                ConsolePrinter.errorOutput(1);
                            }
                        } catch (Exception e) {
                            System.out.print(Colors.ANSI_DEFAULT);
                            ConsolePrinter.errorOutput(1);
                        }
                    }

                    System.out.print(Colors.ANSI_DEFAULT);
                    dbc.addCustomer(new Customer(cust_name, cust_address, phone_num, uid));
                    dbc.addAcc(new Account(uid, pw, initial_balance));

                } else if (choice == 2) {
                    // Log In
                    boolean loggedIn = false;
                    while (true) {
                        ConsolePrinter.Login(1);
                        System.out.print(Colors.ANSI_CYAN);
                        String entered_id = scan.nextLine();
                        System.out.print(Colors.ANSI_DEFAULT);
                        ConsolePrinter.Login(2);
                        System.out.print(Colors.ANSI_CYAN);
                        String entered_pw = scan.nextLine();
                        if (dbc.checkCredentials(entered_id, entered_pw)) {
                            System.out.print(Colors.ANSI_DEFAULT);
                            loggedIn = true;
                            break;
                        } else {
                            System.out.print(Colors.ANSI_DEFAULT);
                            ConsolePrinter.errorOutput(4);
                        }
                    }

                    while (loggedIn) {
                        // Print Logged In User Interface
                        ConsolePrinter.LoggedIn();
                        try {
                            int loggedInUserChoice = Integer.parseInt(scan.nextLine());
                            // deposit
                            if (loggedInUserChoice == 1) {
                                while (true) {
                                    ConsolePrinter.Deposit(1);
                                    try {
                                        System.out.print(Colors.ANSI_CYAN);
                                        double amountDepo = Double.parseDouble(scan.nextLine());
                                        if (amountDepo > 0) {
                                            if (dbc.deposit(amountDepo)) {
                                                System.out.print(Colors.ANSI_DEFAULT);
                                                ConsolePrinter.Deposit(2);
                                                System.out.println(dbc.currBalance());
                                                break;
                                            }
                                        } else {
                                            System.out.print(Colors.ANSI_DEFAULT);
                                            ConsolePrinter.Deposit(3);
                                        }
                                    } catch (Exception e) {
                                        System.out.print(Colors.ANSI_DEFAULT);
                                        ConsolePrinter.Deposit(4);
                                    }
                                }
                            }
                            // Withdrawal
                            else if (loggedInUserChoice == 2) {
                                while (true) {
                                    ConsolePrinter.Withdraw(1);
                                    try {
                                        System.out.print(Colors.ANSI_CYAN);
                                        double amountWithdraw = Double.parseDouble(scan.nextLine());
                                        if (amountWithdraw > 0) {
                                            if (dbc.withdraw(amountWithdraw)) {
                                                System.out.print(Colors.ANSI_DEFAULT);
                                                ConsolePrinter.Withdraw(2);// success
                                                System.out.println(dbc.currBalance());
                                                break;
                                            } else {// unsuccessful
                                                System.out.print(Colors.ANSI_DEFAULT);
                                                ConsolePrinter.Withdraw(3);
                                                System.out.println("Current Balance is $" + dbc.currBalance());
                                            }
                                        } else {
                                            System.out.print(Colors.ANSI_DEFAULT);
                                            ConsolePrinter.Withdraw(5);
                                        }
                                    } catch (Exception e) {
                                        System.out.print(Colors.ANSI_DEFAULT);
                                        ConsolePrinter.Withdraw(4);
                                    }
                                }
                            }
                            // Transfer Funds
                            else if (loggedInUserChoice == 3) {
                                while (true) {
                                    ConsolePrinter.Transfer(1);
                                    System.out.print(Colors.ANSI_CYAN);
                                    String tid = scan.nextLine();
                                    System.out.print(Colors.ANSI_DEFAULT);
                                    if (!dbc.transferCheckId(tid)) {
                                        ConsolePrinter.Transfer(3);
                                    } else {
                                        while (true) {
                                            ConsolePrinter.Transfer(2);
                                            try {
                                                System.out.print(Colors.ANSI_CYAN);
                                                double amountTransfer = Double.parseDouble(scan.nextLine());
                                                if (amountTransfer > 0) {
                                                    if (dbc.transferCheck(amountTransfer)) {
                                                        System.out.print(Colors.ANSI_DEFAULT);
                                                        // Transfer of the money
                                                        dbc.transfer(tid, amountTransfer);
                                                        ConsolePrinter.Transfer(4);
                                                        System.out.println(dbc.currBalance());
                                                        break;
                                                    }
                                                    // invalid
                                                    else {
                                                        System.out.print(Colors.ANSI_DEFAULT);
                                                        ConsolePrinter.Transfer(7);
                                                        System.out.println("Current Balance is $" + dbc.currBalance());
                                                    }
                                                } else {
                                                    System.out.print(Colors.ANSI_DEFAULT);
                                                    ConsolePrinter.Transfer(6);
                                                }
                                            } catch (Exception e) {
                                                System.out.print(Colors.ANSI_DEFAULT);
                                                ConsolePrinter.Transfer(5);
                                            }
                                        }
                                        break;
                                    }

                                }
                            } else if (loggedInUserChoice == 4) {
                                dbc.recentTransactions();
                            } else if (loggedInUserChoice == 5) {
                                dbc.customerInfo();
                            } else if (loggedInUserChoice == 6) {
                                System.out.println("You have signed out!");
                                loggedIn = false;
                            } else {
                                ConsolePrinter.errorOutput(1);
                            }
                        } catch (Exception e) {
                            ConsolePrinter.errorOutput(1);
                        }
                    }
                } else if (choice == 3) {
                    // Exit
                    runApp = false;
                    System.out.println("Thank you for using the DOLLARSBANK Application! Goodbye!");
                } else {
                    ConsolePrinter.errorOutput(1);
                }
            } catch (Exception e) {
                ConsolePrinter.errorOutput(1);
            }
        }
        scan.close();

    }
}
