
public class Solution {
    public static void main(String[] args) {
        printOut();
    }

    public static void printOut() {
        Cat myCat = new Cat();
        myCat.finalize();
        Dog myDog = new Dog();
        myDog.finalize();
    }
}
