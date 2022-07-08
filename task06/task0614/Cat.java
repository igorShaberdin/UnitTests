import java.util.ArrayList;

public class Cat {
    int age;
    public Cat(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat"+
                "age=" + age;
    }

    public static ArrayList<Cat> cats = new ArrayList<>();

    public static void print() {
        for(Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
