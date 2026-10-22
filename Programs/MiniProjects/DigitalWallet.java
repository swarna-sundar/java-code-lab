
import java.util.Scanner;

public class DigitalWallet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;
        System.out.println("1.Deposit  2.Withdraw  3.Check Balance");
        System.out.print("Choose: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Amount: ");
            double amount = sc.nextDouble();
            if (amount > 0) balance += amount;
            else System.out.println("Invalid amount");
        } else if (choice == 2) {
            System.out.print("Amount: ");
            double amount = sc.nextDouble();
            if (amount > 0 && amount <= balance) balance -= amount;
            else System.out.println("Invalid amount or insufficient balance");
        } else if (choice != 3) {
            System.out.println("Invalid choice");
        }
        System.out.printf("Balance: Rs. %.2f%n", balance);
        sc.close();
    }
}
