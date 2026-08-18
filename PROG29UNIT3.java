public class Main {
    void method3() {
        int data = 50 / 0;
    }

    void method2() {
        method3();
    }

    void method1() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in method1: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.method1();
    }
}