import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Write the name");
        String y = console.nextLine();
        System.out.println("Write the number1");
        int x = console.nextInt();
        System.out.println("Write the number2");
        int z = console.nextInt();
        printOut(y, x, z);
    }
    public static void printOut(String y, int x, int z) {
        System.out.print(y+ "'s payment is $" +x+ " in " +z+ " years");
    }
}