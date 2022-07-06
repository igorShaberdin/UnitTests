public class Circle {
    public Color color;
    public static void main(String[] args) {
        printOut();
    }
    public static void printOut() {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.print(circle.color.getDescription());
    }
    public Circle() {
        color = new Color();
    }
}
