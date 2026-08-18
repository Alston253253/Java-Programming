class OuterClass {
    private String outerField = "Outer class message";

    class InnerClass {
        void display() {
            System.out.println("Accessing from Inner class: " + outerField);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.display();
    }
}