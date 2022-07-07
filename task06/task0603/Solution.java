
public class Solution {
    public static void main(String[] args) {
        printOut();
    }

    public static void printOut() {
        for (int i=0; i < 50000; i++) {
            new Cat();
            new Dog();
        }
    }
    static void test(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(new Dog());
        }
    }
}
