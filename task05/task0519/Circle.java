public class Circle {
    int centerX;
    int centerY;
    double radius;
    int width;
    String color;

    @Override
    public String toString() {
        return "Circle{" +
                "centerX=" + centerX +
                ", centerY=" + centerY +
                ", radius=" + radius +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }

    public Circle (int centerY, int centerX, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public Circle (int centerY, int centerX, double radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public Circle (int centerY, int centerX, double radius, int width, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
