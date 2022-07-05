public class Main {
    public static void main(String[] args) {
        printDog();
    }
    public static void printDog() {
        Dog myDog = new Dog();
        myDog.setName("Bygor");
        myDog.setAge(5);
        System.out.print(myDog);
    }
}
