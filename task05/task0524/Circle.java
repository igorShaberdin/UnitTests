public class Circle {
    int radius;
    int b;
    int c;
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
    Circle (int radius, int b, int c) {
        this.radius = radius;
        this.c = c;
        this.b = b;
    }
}
