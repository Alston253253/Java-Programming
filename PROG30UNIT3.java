public class Main {
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                throw new RuntimeException("Higher level exception occurred", e);
            }
        } catch (RuntimeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Original Cause: " + e.getCause());
        }
    }
}