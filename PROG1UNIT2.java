import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display the user's name
        System.out.println("Hello, " + name + "!");

        // Close the scanner
        scanner.close();
    }
}