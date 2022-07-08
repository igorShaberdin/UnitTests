public class Cat {
    String name;
    String father;
    String mother;
    Cat(String name, String father, String mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "name= " + name + " father= " + father + " mother= " + mother;
    }
}
