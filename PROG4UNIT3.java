public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            numbers[2] = 30 / 0;
            System.out.println("Element: " + numbers[10]);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("Error: General exception occurred.");
        }
    }
}