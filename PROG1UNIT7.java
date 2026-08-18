import java.util.Scanner;

public class IfConditionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        // Check if the number is Positive, Negative, or Zero
        if (number > 0) {
            System.out.println(number + " is a POSITIVE number.");

            // Nested IF condition to check if positive number is Even or Odd
            if (number % 2 == 0) {
                System.out.println(number + " is also EVEN.");
            } else {
                System.out.println(number + " is also ODD.");
            }

        } else if (number < 0) {
            System.out.println(number + " is a NEGATIVE number.");
        } else {
            System.out.println("The number is ZERO.");
        }

        scanner.close();
    }
}