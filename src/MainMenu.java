import java.util.*;

public class MainMenu {
    public static void mainmenu(Scanner sc) {

        //REGISTRATION
        String name;
        String Pin;


        //CHOICES
        int aChoice;
        int fchoice;
        int rchoice;


        //SAVINGS
        final double sMin = 1000;
        final double wLimit = 20000;
        final double interest = 0.30;
        double iDeposit = 0;
        double tbalance;

        //CURRENT
        final int cMin = 5000;


        //BALANCE OPERATIONS
        double Balance = sMin + iDeposit;

        //loops
        boolean regpin = true;
        boolean u_name = true;


        //MAIN MENU
        System.out.println("Welcome to the Multi-Tier Bank Account Management System!");
        System.out.println("1. Register Account");
        System.out.println("2. Login Account");
        System.out.println("3. Exit");

        System.out.print("Enter your choice: ");
        fchoice = sc.nextInt();
        if (fchoice == 1) {

            //REGISTRATION

            while (u_name == true) {
                sc.nextLine();
                System.out.println("Enter a username: ");
                name = sc.nextLine();
                if (name.length() > 20) {
                    System.out.println("you can only enter a maximum of 20 characters!");
                    continue;
                }
                break;
            }

            while (regpin == true) {
                System.out.println("Enter a 4-digit pin: ");
                Pin = sc.nextLine();
                if (Pin.length() != 4) {
                    System.out.println("Please enter a 4-digit pin!");
                    continue;
                }
                break;
            }


            System.out.println("Choose account type: ");
            System.out.println("1. Savings");
            System.out.println("2. Current");

            System.out.println("Enter you choice: ");
            aChoice = sc.nextInt();

            if (aChoice == 1) {

                //SAVINGS

                System.out.println("Enter your initial deposit amount: ");
                iDeposit = sc.nextInt();
                if (iDeposit >= sMin) {
                    System.out.println("Registration Successful!");
                    System.out.println("1.Login now ");
                    System.out.println("2.Return to Menu ");
                    System.out.println("Enter your choice: ");
                    rchoice = sc.nextInt();

                    if (rchoice == 1) {

                        //LOGIN CODE IF USER CHOOSES TO LOG IN AFTER REGISTRATION

                        if (LoginService.login(sc, "johndoe", "1234")) {

                            Operations.AccountOperations(sc, aChoice);

                        } else {

                            System.out.println("Login Failed!");

                        }

                    } else if (rchoice == 2) {

                        //GO BACK TO MENU

                    } else if (sc.hasNextInt()) {
                        System.out.println("ERROR");
                        return;
                    }


                } else if (iDeposit < sMin) {
                    System.out.println("Invalid deposit. Minimum balance for a Savings account is 1000.");
                } else if (!sc.hasNextInt()) {
                    System.out.println("Error!");
                }


            } else if (aChoice == 2) {

                //CURRENT

                System.out.println("Enter your initial deposit amount: ");
                iDeposit = sc.nextInt();
                if (iDeposit >= cMin) {
                    System.out.println("Registration Successful!");
                    System.out.println("1.Login now ");
                    System.out.println("2.Return to Menu ");
                    System.out.println("Enter your choice: ");
                    rchoice = sc.nextInt();
                    if (rchoice == 1) {

                        //LOGIN CODE IF USER CHOOSES TO LOG IN AFTER REGISTRATION

                        if (LoginService.login(sc, "johndoe", "1234")) {
                            Operations.AccountOperations(sc, aChoice);
                        } else {
                            System.out.println("Login Failed!");
                        }

                    } else if (rchoice == 2) {

                        MainMenu.mainmenu(sc);

                    } else if (sc.hasNextInt()) {

                        System.out.println("ERROR");

                    }
                } else if (iDeposit < cMin) {
                    System.out.println("Invalid deposit. Minimum balance for a Current account is 5000.");
                } else if (!sc.hasNextInt()) {
                    System.out.println("Error!");
                }

            } else if (aChoice > 2) {
                System.out.println("Error!");
                return;
            } else if (!sc.hasNextInt()) {
                System.out.println("INVALID INPUT");
                return;
            }


        } else if (fchoice == 2) {

            //LOGIN

            if (LoginService.login(sc, "johndoe", "1234")) {
                Operations.AccountOperations(sc, fchoice);
            }


        } else if (fchoice == 3) {
            System.out.println("Thank you!");
            return;
        } else if (fchoice > 3) {
            System.out.println("INVALID INPUT");
            return;
        }


    }
}
