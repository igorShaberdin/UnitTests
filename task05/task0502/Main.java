
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Killer",7);
        Cat cat2 = new Cat("Bob", 8);
        Cat cat3 = new Cat("Robocat",9);
        boolean m = (cat3.fight(cat2));
        if (m) {
            cat3.printName(cat3);
        }
    }
}
//не решен вопрос с именами









