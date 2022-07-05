public class Dog {
    String name;
    int growth;
    String color;
    public void initDog1 (String name) {
        this.name = name;
        System.out.print("name: " + name);
    }
    public void initDog2 (String name, int growth) {
        this.name = name;
        this.growth = growth;
        System.out.print("name: " + name + " growth: " + growth);
    }
    public void initDog3 (String name, int growth, String color) {
        this.name = name;
        this.growth = growth;
        this.color = color;
        System.out.print("name: " + name + " growth: " + growth + " color: " + color);
    }
}
