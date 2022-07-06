public class Man {
    String name;
    int age;
    String address;

    @Override
    public String toString() {
        return name + " " + age + " " + address;
    }

    Man (String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
