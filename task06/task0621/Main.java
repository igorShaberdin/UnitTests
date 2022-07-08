
public class Main {

    public static void main(String[] args) {
        printAnswer();
    }

    public static void printAnswer() {
        Cat cat1 = new Cat("grantfa", "no", "no");
        Cat cat2 = new Cat("grantma", "no", "no");
        Cat cat3 = new Cat("father", "grantfa", "no");
        Cat cat4 = new Cat("mother", "no", "grantma");
        Cat cat5 = new Cat("son", "father", "mother");
        Cat cat6 = new Cat("girl", "father", "mother");
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
        System.out.println(cat5);
        System.out.println(cat6);
    }
}












