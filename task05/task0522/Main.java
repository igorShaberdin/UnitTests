
public class Main {
    public static void main(String[] args) {
        figur();
    }
    public static void figur() {
        Circle circle = new Circle();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle anotherCircle = new Circle(10, 4);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
        Circle oneCircle = new Circle(32);
        System.out.println(oneCircle.x + " " + oneCircle.y + " " + oneCircle.radius);
    }
}

