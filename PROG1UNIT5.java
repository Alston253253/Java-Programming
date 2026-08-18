import java.util.Scanner;

public class UserInputTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String input (single word)
        System.out.print("Enter your username (String - single word): ");
        String username = scanner.next();

        // Integer input
        System.out.print("Enter your age (int): ");
        int age = scanner.nextInt();

        // Floating-point input
        System.out.print("Enter your GPA or salary (double): ");
        double gpa = scanner.nextDouble();

        // Boolean input (true/false)
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // Character input
        System.out.print("Enter your grade (char): ");
        char grade = scanner.next().charAt(0);

        // Clear remaining buffer before reading full line
        scanner.nextLine(); 

        // String input (full line/sentence)
        System.out.print("Enter a short bio (String - full line): ");
        String bio = scanner.nextLine();

        // Displaying all collected values
        System.out.println("\n--- DISPLAYING INPUT VALUES ---");
        System.out.println("Username : " + username);
        System.out.println("Age      : " + age);
        System.out.println("GPA      : " + gpa);
        System.out.println("Student  : " + isStudent);
        System.out.println("Grade    : " + grade);
        System.out.println("Bio      : " + bio);

        scanner.close();
    }
}