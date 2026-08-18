abstract class Shape {
    abstract void draw();

    void display() {
        System.out.println("Displaying shape...");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.display();
        circle.draw();

        System.out.println();

        rectangle.display();
        rectangle.draw();
    }
}