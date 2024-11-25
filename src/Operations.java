import java.util.Scanner;

public class Operations {
    public static void AccountOperations(Scanner sc, int AccountType) {


        //USERNAME AND PASSWORD
        final String uLog = "johndoe";
        final String uPin = "1234";

        //CHOICES

        int eChoice;
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



        System.out.println("1.Savings");
        System.out.println("2.Current");
        System.out.println("Enter your choice: ");
        aChoice = sc.nextInt();


        switch (AccountType) {
            case 1:

                //SAVINGS
                if (aChoice == 1) {
                    System.out.println("Welcome, " + " " + uLog + "This is your savings account");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit Money");
                    System.out.println("3. Withdraw Money");
                    System.out.println("4. Calculate Interest(Savings Only)");
                    System.out.println("5. Logout");

                    System.out.println("Enter your choice: ");
                    int lChoice = sc.nextInt();
                    if (lChoice == 1) {
                        System.out.println("Your available balance is: " + Balance);
                        return;
                    } else if (lChoice == 2) {
                        System.out.println("Enter amount to deposit: ");
                        double dAmount;
                        if (!sc.hasNextDouble()) {
                            System.out.println("You can only deposit money amounts!");
                            return;
                        } else {
                            dAmount = sc.nextDouble();
                        }
                        tbalance = dAmount + Balance;
                        System.out.println("Your balance is now: " + tbalance);
                        return;
                    } else if (lChoice == 3) {
                        System.out.println("Enter amount to withdraw: ");
                        double dWithAmount = 0.0;
                        if (!sc.hasNextDouble()) {
                            System.out.println("You can only withdraw money amounts!");
                        } else {
                            dWithAmount = sc.nextDouble();
                        }
                        tbalance = Balance - dWithAmount;
                        System.out.println("Your balance is now: " + tbalance);
                        return;
                    } else if (lChoice == 4) {
                        double tInterest = Balance * interest * 1;
                        System.out.println("Your total interest is: " + tInterest);
                        return;
                    } else if (lChoice == 5) {
                        System.out.println("Logout Successful! ");
                        return;
                    }
                }
                break;

                case 2:

                //CURRENT

                System.out.println("Welcome, " + " " + uLog + "This is your current account");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Calculate Interest(Savings Only)");
                System.out.println("5. Logout");

                System.out.println("Enter your choice: ");
                int lChoice = sc.nextInt();
                if (lChoice == 1) {
                    System.out.println("Your available balance is: " + Balance);
                    return;
                } else if (lChoice == 2) {
                    System.out.println("Enter amount to deposit: ");
                    double dAmount;
                    if (!sc.hasNextDouble()) {
                        System.out.println("You can only deposit money amounts!");
                        return;
                    } else {
                        dAmount = sc.nextDouble();
                    }
                    tbalance = dAmount + Balance;
                    System.out.println("Your balance is now: " + tbalance);
                    return;
                } else if (lChoice == 3) {
                    System.out.println("Enter amount to withdraw: ");
                    double dWithAmount = 0.0;
                    if (!sc.hasNextDouble()) {
                        System.out.println("You can only withdraw money amounts!");
                    } else {
                        dWithAmount = sc.nextDouble();
                    }
                    tbalance = Balance - dWithAmount;
                    System.out.println("Your balance is now: " + tbalance);
                    return;
                } else if (lChoice == 4) {
                    System.out.println("Only available in Savings Account! ");
                    return;
                } else if (lChoice == 5) {
                    System.out.println("Logout Successful! ");
                    return;
                } else {
                    System.out.println("Invalid choice!");
                    return;
                }

        }
    }
}
