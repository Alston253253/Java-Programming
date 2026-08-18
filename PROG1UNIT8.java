public class OddEvenCommandLine {
    public static void main(String[] args) {
        // Check if at least one command-line argument is passed
        if (args.length == 0) {
            System.out.println("Please provide an integer as a command-line argument.");
            System.out.println("Usage: java OddEvenCommandLine <number>");
            return;
        }

        try {
            // Parse the command-line argument to an integer
            int number = Integer.parseInt(args[0]);

            // Check if the number is even or odd using the modulus operator (%)
            if (number % 2 == 0) {
                System.out.println(number + " is an EVEN number.");
            } else {
                System.out.println(number + " is an ODD number.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: '" + args[0] + "' is not a valid integer.");
        }
    }
}