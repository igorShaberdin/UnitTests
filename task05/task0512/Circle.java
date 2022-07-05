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

    public void initCircle1 (int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public void initCircle2 (int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public void initCircle3 (int centerX, int centerY, int radius, int width, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.color = color;
        this.radius = radius;
        this.width = width;

    }
}
