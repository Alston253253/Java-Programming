class OuterClass {
    private static String staticOuterField = "Static outer field";

    static class StaticNestedClass {
        void display() {
            System.out.println("Accessing from Static Inner class: " + staticOuterField);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display();
    }
}