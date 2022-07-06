public class Solution {
    public static void main(String[] args) {
        printOut();
    }
    public static void printOut() {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1 + "" + duck2);
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1 + "" + cat2);
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.print(dog1 + "" + dog2);
    }
}
