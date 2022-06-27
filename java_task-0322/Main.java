import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Write the name");
        String y = console.nextLine();
        System.out.println("Write the name");
        String x = console.nextLine();
        System.out.println("Write the name");
        String z = console.nextLine();
        printOut(y, x, z);
    }
    public static void printOut(String y, String x, String z) {
        System.out.print(y+ " + " +x+ " + " +z+ " = pure love, yea, baby");
    }
}