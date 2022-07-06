public class Dog {
    String name;
    int high;
    String color;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", high=" + high +
                ", color='" + color + '\'' +
                '}';
    }

    public Dog (String name) {
        this.name = name;
    }
    public Dog (String name, int high) {
        this.name = name;
        this.high = high;
    }
    public Dog (String name, int high, String color) {
        this.name = name;
        this.color = color;
        this.high = high;
    }
}
