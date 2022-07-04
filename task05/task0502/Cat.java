public class Cat extends Animal {
    public Cat(String name, int strength) {
    }

    @Override
    public boolean fight(Cat anotherCat) {
        return this.strength == anotherCat.strength;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public String printName(Cat name) {
        System.out.println(name + " winner");
        return this.name = String.valueOf(name);
    }
}


