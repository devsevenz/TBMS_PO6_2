import java.util.*;

public class TBMS_PO6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int fchoice;


        //MAIN MENU
        System.out.println("Welcome to the Multi-Tier Bank Account Management System!");
        System.out.println("1. Register Account");
        System.out.println("2. Login Account");
        System.out.println("3. Exit");

        System.out.print("Enter your choice: ");
        fchoice = sc.nextInt();

        if (fchoice == 1){

            Registration.register(sc);

        } else if (fchoice == 2) {

            //LOGIN

            if (LoginService.login(sc, "johndoe", "1234")) {
                Operations.AccountOperations(sc);
            }


        } else if (fchoice == 3) {
            System.out.println("Thank you!");

        } else if (fchoice > 3) {
            System.out.println("INVALID INPUT");

        }

    }
}



