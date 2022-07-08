
public class Main {
    public static void main(String[] args) {
        test(5);
    }
    public static void test(int n) {
        for(int i = 0; i < n; i++) {
            Cat.cats.add(new Cat(1));
        }
        Cat.print();
    }
}










