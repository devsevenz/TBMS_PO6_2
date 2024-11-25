import java.util.Scanner;

public class Operations {
    public static void AccountOperations(Scanner sc) {


        //USERNAME
        final String uLog = "johndoe";

        //CHOICES

        int aChoice;
        int lChoice;

        //SAVINGS & CURRENT

        final double sMin = 1000;
        final double wLimit = 20000;
        final double interest = 0.30;
        double iDeposit = 0.0;
        double tbalance;


        //BALANCE OPERATIONS
        double Balance = sMin + iDeposit;
        double dAmount;
        double dAmount2 = 0;



        System.out.println("1.Savings");
        System.out.println("2.Current");
        System.out.println("Enter your choice: ");
        aChoice = sc.nextInt();


        switch (aChoice) {
            case 1:

                //SAVINGS

                System.out.println("Welcome, " + " " + uLog + " " + "This is your Savings account");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Calculate Interest(Savings Only)");
                System.out.println("5. Logout");

                System.out.println("Enter your choice: ");
                lChoice = sc.nextInt();

                switch (lChoice) {
                    case 1:
                        System.out.println("Your Balance is " + Balance);
                        break;

                    case 2:
                        System.out.println("Enter amount to deposit: ");

                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid input!");
                            return;
                        } else {
                            dAmount = sc.nextDouble();
                            tbalance = Balance + dAmount;
                            System.out.println("Your Balance total is " + tbalance);
                        }
                        break;

                    case 3:
                        System.out.println("Enter amount to withdraw: ");
                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid input!");
                        } else if (dAmount2 > wLimit) {
                            System.out.println("Maximum Withdraw Limit is 20,000");
                        } else {
                            dAmount2 = sc.nextDouble();
                            tbalance = Balance - dAmount2;
                            System.out.println("Your Balance total is " + tbalance);
                        }
                        break;
                    case 4:
                        double tInterest = Balance * interest * 1;
                        System.out.println("Your Interest is " + tInterest);
                        break;
                    case 5:
                        System.out.println("Logout Successful! ");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;

                }

            case 2:

                //CURRENT

                System.out.println("Welcome, " + " " + uLog + " " + "This is your Current account");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Calculate Interest(Savings Only)");
                System.out.println("5. Logout");

                System.out.println("Enter your choice: ");
                lChoice = sc.nextInt();

                switch (lChoice) {
                    case 1:
                        System.out.println("Your Balance is " + Balance);
                        break;
                    case 2:
                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid input!");
                            return;
                        } else {
                            dAmount = sc.nextDouble();
                            tbalance = Balance + dAmount;
                            System.out.println("Your Balance total is " + tbalance);
                        }
                        break;
                    case 3:
                        System.out.println("Enter amount to withdraw: ");
                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid input!");
                        } else if (dAmount2 > wLimit) {
                            System.out.println("Maximum Withdraw Limit is 20,000");
                        } else {
                            dAmount2 = sc.nextDouble();
                            tbalance = Balance - dAmount2;
                            System.out.println("Your Balance total is " + tbalance);
                        }
                        break;
                    case 4:
                        System.out.println("Only Available in savings account! ");
                        break;
                    case 5:
                        System.out.println("Logout Successful! ");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
                break;
                default:
                    System.out.println("Invalid choice");
        }


    }
}
