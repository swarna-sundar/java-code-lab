Create a program that checks whether an integer is even or odd, positive or negative, and prints its multiplication table.

  
import java.util.Scanner;

public class NumberPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check whether the number is even or odd.
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Check whether the number is positive, negative, or zero.
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // Print the multiplication table.
        System.out.println("Multiplication table of " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
