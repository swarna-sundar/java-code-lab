
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Marks in Java: ");
        int java = sc.nextInt();

        System.out.print("Marks in SQL: ");
        int sql = sc.nextInt();

        System.out.print("Marks in Maths: ");
        int maths = sc.nextInt();

        int total = java + sql + maths;
        double average = total / 3.0;

        System.out.println("Total Marks: " + total + " / 300");
        System.out.println("Average: " + average + "%");

        if (java < 35 || sql < 35 || maths < 35) {
            System.out.println("Result: FAIL");
        } else {
            System.out.println("Result: PASS");

            if (average >= 90) {
                System.out.println("Grade: A+");
            } else if (average >= 80) {
                System.out.println("Grade: A");
            } else if (average >= 70) {
                System.out.println("Grade: B");
            } else if (average >= 60) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        }

        sc.close();
    }
}
