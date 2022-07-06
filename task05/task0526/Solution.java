public class Solution {
    public static void main(String[] args) {
        printOut();
    }
    public static void printOut() {
        Woman firstW = new Woman("Nicol", 23, "non");
        Man firstM = new Man("Rey", 58, "Green street, 15");
        System.out.println(firstM);
        System.out.print(firstW.name + " " + firstW.age + " " + firstW.address);
    }
}
