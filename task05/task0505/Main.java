
public class Main {
    public static void main(String[] args) {
        check();
    }

    public static void check() {
        Cat cat1 = new Cat("Killer", 7);
        Cat cat2 = new Cat("Bob", 8);
        Cat cat3 = new Cat("Robocat", 9);
        boolean m = (cat3.fight(cat2));
        if (m) {
            cat3.printName();
        }
        boolean n = (cat2.fight(cat1));
        if (n) {
            cat3.printName();
        }
        boolean s = (cat1.fight(cat3));
        if (s) {
            cat3.printName();
        }
        else cat1.lose();
    }
}










