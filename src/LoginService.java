import java.util.Scanner;

public class LoginService {
    public static boolean login(Scanner sc, String username, String password) {
        int attempts = 0;
        final int maxAttempts = 3;

        while (attempts < maxAttempts) {
            sc.nextLine();
            System.out.println("Enter your username: ");
            String ulog = sc.nextLine().trim();

            System.out.println("Enter your 4-digit pin: ");
            String upin = sc.nextLine().trim();

            if (ulog.equals(username) && upin.equals(password)) {
                System.out.println("Login Successful!");

                //LOGIN SUCCESSFUL

                return true;
            } else {

                //IF USER INPUTS WRONG CREDENTIALS

                attempts++;
                System.out.println("Incorrect Credentials. " + "You have "+ (maxAttempts - attempts) + " attempts left.");
                continue;
            }
        }

        //LOGIN FAILED

        System.out.println("Account locked due to multiple login attempts. ");
        return false;

    }

}
