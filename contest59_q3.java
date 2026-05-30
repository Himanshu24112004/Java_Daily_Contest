import java.util.*;

abstract class Shape {
    String shapeName;

    Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract void area(); // abstract method for polymorphism
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Shape: " + shapeName);
        System.out.printf("Area: %.2f\n", Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.println("Shape: " + shapeName);
        System.out.printf("Area: %.2f\n", (double) length * breadth);
    }
}

class Triangle extends Shape {
    int base, height;

    Triangle(int base, int height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println("Shape: " + shapeName);
        System.out.printf("Area: %.2f\n", 0.5 * base * height);
    }
}

public class contest59_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            String type = sc.next();
            Shape d = null;

            switch (type) {
                case "Circle":
                    int r = sc.nextInt();
                    d = new Circle(r);
                    break;

                case "Rectangle":
                    int l = sc.nextInt();
                    int b = sc.nextInt();
                    d = new Rectangle(l, b);
                    break;

                case "Triangle":
                    int base = sc.nextInt();
                    int h = sc.nextInt();
                    d = new Triangle(base, h);
                    break;
            }

            d.area(); // runtime polymorphism
        }

        sc.close();
    }
}
