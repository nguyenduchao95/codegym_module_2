package b4;

public class Circle {
    private int id;
    static int increase;

    static double maxRadius;
    static double totalArea;
    private double radius;
    static final double PI = 3.14;

    public Circle(double radius) {
        this.id = ++increase;
        this.radius = radius;
        if (maxRadius < radius) {
            maxRadius = radius;
        }
        totalArea += this.getArea();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id=" + this.id +
                ", radius=" + this.radius +
                '}';
    }

    public double getArea() {
        return PI * this.radius * this.radius;
    }

    public static double getTotalArea() {
        return totalArea;
    }
}
