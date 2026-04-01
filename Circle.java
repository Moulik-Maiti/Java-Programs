import java.util.Scanner;
class Point {
    Scanner sc = new Scanner(System.in);

    int x, y;

    void input() {
        System.out.print("Enter x coordinate: ");
        x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        y = sc.nextInt();
    }

    void display() {
        System.out.println("Center (x, y): (" + x + ", " + y + ")");
    }
}

class Circle {
    Scanner sc = new Scanner(System.in);
    double radius;
    Point center;

    Circle() {
        center = new Point();
    }

    void input() {
        System.out.println("Enter center coordinates:");
        center.input();
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }

    double area() {
        return 3.14 * radius * radius;
    }

    void display() {
        center.display();
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area());
    }
}

 class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        c.input();

        System.out.println("Circle Details:");
        c.display();

        sc.close();
    }
}