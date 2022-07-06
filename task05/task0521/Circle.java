public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this(x, y, 15);
    }

    public Circle() {
        this(6, 7, 3);
    }
}
