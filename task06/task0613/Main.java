
public class Main {
    public static void main(String[] args) {
        test(10);
    }
    public static void test(int n) {
        for (int i = 0; i < n; i++) {
            new Cat();
        }
        System.out.print(Cat.catCount);
    }
}










