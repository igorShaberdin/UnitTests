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
        System.out.println(y+ "'s payment is " +x+ " in " +z+ " years");
    }
}

