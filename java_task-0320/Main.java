import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Write the name");
        String y = console.nextLine();
        printOut(y);
    }
    public static void printOut(String y) {
        System.out.print(y+ "'s payment is $5000. ha-ha-ha");
    }
}