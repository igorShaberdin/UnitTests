public class Solution {
    public static void main(String[] args) {
        printOut();
    }
    public static void printOut() {
        Dog polDog = new Dog("Pol", 5, "angry");
        Cat tomCat = new Cat("Tom", 3, "kind");
        Mouse jerryMouse = new Mouse("Jerry", 1, "bich");
        System.out.println(polDog);
        System.out.println(tomCat);
        System.out.print(jerryMouse);
    }
}
