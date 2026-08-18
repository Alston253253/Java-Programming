public class Main {
    public static void main(String[] args) {
        try {
            int dividend = 50;
            int divisor = 0;
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: Cannot divide by zero.");
        }
    }
}