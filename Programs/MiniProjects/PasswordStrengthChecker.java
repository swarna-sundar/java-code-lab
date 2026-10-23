import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        int score = 0;

        if (password.length() >= 8) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[^a-zA-Z0-9].*")) score++;

        System.out.print("Password strength: ");

        if (score <= 2) {
            System.out.println("Weak");
        } else if (score <= 4) {
            System.out.println("Moderate");
        } else {
            System.out.println("Strong");
        }

        scanner.close();
    }
}
