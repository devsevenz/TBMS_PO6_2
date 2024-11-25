import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


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

        if (Registration.register(sc)){
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



