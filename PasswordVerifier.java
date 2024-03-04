import java.util.Scanner;

public class PasswordVerifier {
    public boolean verifyPassword(String password) {
        // Check if password length is at least 6 characters
        if (password.length() < 6) {
            return false;
        }

        // Check if password contains at least one uppercase letter
        boolean hasUpperCase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
                break;
            }
        }
        if (!hasUpperCase) {
            return false;
        }

        // Check if password contains at least one lowercase letter
        boolean hasLowerCase = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
                break;
            }
        }
        if (!hasLowerCase) {
            return false;
        }

        // Check if password contains at least one digit
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        PasswordVerifier verifier = new PasswordVerifier();
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?-> ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ". This is top secret data and you need to create a password to keep it safe...");
        System.out.println("Your password must meet the following characteristics to be created:");
        System.out.println("- At least six characters long");
        System.out.println("- At least one uppercase and one lowercase letter");
        System.out.println("- At least one digit");
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (verifier.verifyPassword(password)) {
            System.out.println("Thank you! Your password has been created and logged....Keep it secret!!!");
        } else {
            System.out.println("Password not accepted.");
        }
        scanner.close();
    }
}
