public class Mouse {
    String name;
    int age;
    String mood;

    @Override
    public String toString() {
        return name + " " + age + " " + mood;
    }

    Mouse (String name, int age, String mood) {
        this.name = name;
        this.age = age;
        this.mood = mood;
    }
}
