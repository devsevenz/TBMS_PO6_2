import java.util.Scanner;

public class Registration {
    public static boolean register(Scanner sc) {

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
                System.out.println("Error! Please enter a 4-digit pin!");
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

                    //GO BACK TO MENU IF THE USER INPUTS 2

                    MainMenu.mainmenu(sc);

                } else if (sc.hasNextInt()) {
                    System.out.println("ERROR");
                    return regpin;
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

                    //GO BACK TO MENU IF THE USER INPUTS 2

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
            return regpin;
        } else if (!sc.hasNextInt()) {
            System.out.println("INVALID INPUT");
            return regpin;
        }
        return true;
    }
}
