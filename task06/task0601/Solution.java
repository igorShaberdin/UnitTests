
public class Solution {
    public static void main(String[] args) throws Throwable {
        printOut();
    }

    public static void printOut() throws Throwable {
        Cat myCat = new Cat();
        myCat.finalize();
    }
}
