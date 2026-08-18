class OuterClass {
    void display() {
        class LocalInnerClass {
            void msg() {
                System.out.println("Inside Local Inner Class");
            }
        }

        LocalInnerClass localInner = new LocalInnerClass();
        localInner.msg();
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.display();
    }
}