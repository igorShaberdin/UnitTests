import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Write the name");
        String y = console.nextLine();
        System.out.println("Write the number");
        int x = console.nextInt();
        System.out.println(y + " take over the world in " + x + " years.Ha-ha-ha");
    }
}

