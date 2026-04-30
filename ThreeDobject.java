import java.util.Scanner;

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    double l, b, h;

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * (l * b + b * h + l * h);
    }

    double volume() {
        return l * b * h;
    }
}

class Cube extends ThreeDObject {
    double s;

    Cube(double s) {
        this.s = s;
    }

    double wholeSurfaceArea() {
        return 6 * s * s;
    }

    double volume() {
        return s * s * s;
    }
}

class Cylinder extends ThreeDObject {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * r * (r + h);
    }

    double volume() {
        return Math.PI * r * r * h;
    }
}

class Cone extends ThreeDObject {
    double r, h;

    Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        double l = Math.sqrt(r * r + h * h);
        return Math.PI * r * (r + l);
    }

    double volume() {
        return (Math.PI * r * r * h) / 3;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreeDObject obj;

        System.out.println("Enter length breadth height of Box:");
        obj = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Box Area = " + obj.wholeSurfaceArea());
        System.out.println("Box Volume = " + obj.volume());

        System.out.println("Enter side of Cube:");
        obj = new Cube(sc.nextDouble());
        System.out.println("Cube Area = " + obj.wholeSurfaceArea());
        System.out.println("Cube Volume = " + obj.volume());

        System.out.println("Enter radius and height of Cylinder:");
        obj = new Cylinder(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cylinder Area = " + obj.wholeSurfaceArea());
        System.out.println("Cylinder Volume = " + obj.volume());

        System.out.println("Enter radius and height of Cone:");
        obj = new Cone(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cone Area = " + obj.wholeSurfaceArea());
        System.out.println("Cone Volume = " + obj.volume());
    }
}
