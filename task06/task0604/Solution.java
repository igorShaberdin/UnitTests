
public class Solution {
    public static void main(String[] args) throws Throwable {
        printOut();
    }

    public static void printOut() throws Throwable {
        Cat myCat = new Cat();
        new Cat();
        myCat.finalize();

    }
    static void test(int a) {
        int cat = 0;
        for (int i = 0; i < a; i++) {
             cat += 1;
        }
        System.out.print(cat);
    }
}
