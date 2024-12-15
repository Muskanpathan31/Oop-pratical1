import java.util.Scanner;

abstract class Shape {
    double dimension1, dimension2;

    void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first dimension: ");
        dimension1 = sc.nextDouble();
        System.out.print("Enter second dimension: ");
        dimension2 = sc.nextDouble();
    }

    abstract void computeArea();
}

class Triangle extends Shape {

    void computeArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Rectangle extends Shape {

    void computeArea() {
        double area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for Triangle or 2 for Rectangle: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            Triangle triangle = new Triangle();
            triangle.inputData();
            triangle.computeArea();
        } else if (choice == 2) {
            Rectangle rectangle = new Rectangle();
            rectangle.inputData();
            rectangle.computeArea();
        } else {
            System.out.println("Invalid choice");
        }
    }
}
