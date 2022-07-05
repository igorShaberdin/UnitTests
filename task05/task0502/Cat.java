public class Cat extends Animal {
    public Cat(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }
    @Override
    public boolean fight(Cat anotherCat) {
        return this.strength >= anotherCat.strength;
    }
    @Override
    public String toString() {
        return this.name;
    }
    public void printName() {
        System.out.print(name + " winner");
    }
}


