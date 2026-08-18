public class ArithmeticOperations {
    public static void main(String[] args) {
        // Ensure exactly 3 arguments are provided
        if (args.length < 3) {
            System.out.println("Usage: java ArithmeticOperations <num1> <operator (+, -, *, /)> <num2>");
            System.out.println("Note: On some terminals, use \"*\" in quotes for multiplication.");
            return;
        }

        try {
            // Parse numerical inputs
            double num1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double num2 = Double.parseDouble(args[2]);
            double result = 0;

            // Perform operation based on operator
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator! Use +, -, *, or /.");
                    return;
            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numerical values.");
        }
    }
}