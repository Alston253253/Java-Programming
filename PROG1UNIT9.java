import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for 3 subjects (out of 100 each)
        System.out.print("Enter marks for Subject 1 (0-100): ");
        double sub1 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 2 (0-100): ");
        double sub2 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3 (0-100): ");
        double sub3 = scanner.nextDouble();

        // Check for passing condition in individual subjects (min 35 required)
        if (sub1 < 35 || sub2 < 35 || sub3 < 35) {
            System.out.println("\nResult: FAIL (Scored less than 35 in one or more subjects)");
        } else {
            // Calculate total and percentage
            double total = sub1 + sub2 + sub3;
            double percentage = total / 3.0;

            System.out.println("\n--- STUDENT SCORECARD ---");
            System.out.println("Total Marks : " + total + " / 300");
            System.out.println("Percentage  : " + String.format("%.2f", percentage) + "%");
            System.out.println("Result      : PASS");

            // Determine Grade using IF - ELSE IF conditions
            if (percentage >= 90) {
                System.out.println("Grade       : A+ (Outstanding)");
            } else if (percentage >= 80) {
                System.out.println("Grade       : A (Excellent)");
            } else if (percentage >= 70) {
                System.out.println("Grade       : B (Very Good)");
            } else if (percentage >= 60) {
                System.out.println("Grade       : C (Good)");
            } else if (percentage >= 50) {
                System.out.println("Grade       : D (Average)");
            } else {
                System.out.println("Grade       : E (Pass)");
            }
        }

        scanner.close();
    }
}