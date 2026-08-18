import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user for personal information
        System.out.print("Enter your Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character left by nextInt()

        System.out.print("Enter your Gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter your Email Address: ");
        String email = scanner.nextLine();

        System.out.print("Enter your City: ");
        String city = scanner.nextLine();

        // Displaying the gathered information
        System.out.println("\n==================================");
        System.out.println("       PERSONAL INFORMATION       ");
        System.out.println("==================================");
        System.out.println("Full Name : " + fullName);
        System.out.println("Age       : " + age);
        System.out.println("Gender    : " + gender);
        System.out.println("Email     : " + email);
        System.out.println("City      : " + city);
        System.out.println("==================================");

        scanner.close();
    }
}