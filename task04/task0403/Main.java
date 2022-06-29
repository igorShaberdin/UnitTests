
public class Main {
    public static void main(String[] args) {
        setName name = new setName();
        setName.name("Boris");
        setName.name("Semen");
    }

    public static class setName {
        static void name(String name) {
        System.out.println("Your name is " +name);
        }
    }
}

