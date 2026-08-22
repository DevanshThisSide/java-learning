package JL07_oops;

class Circle {
    public int radius;

    public Circle(int r) {
        this.radius = r;
        System.out.println("Circle Parameterized Constructor Called....");
    }

    public double circleArea() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder extends Circle {
    public int height;

    public Cylinder(int r, int h) {
        super(r);
        this.height = h;
        System.out.println("Cylinder Parameterized Constructor Called....");
    }

    public double cylinderVolume() {
        return circleArea() * height;
    }
}

public class InheritancePractice {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(12, 4);
        System.out.printf("Area Of Circle with radius 12 units is %.2f units square%n", obj.circleArea());
        System.out.printf("Volume Of Cylinder with radius 12 units and height 4 units is %.2f units cube", obj.cylinderVolume());
    }
}