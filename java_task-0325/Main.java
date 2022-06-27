import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("write the number: ");
        int x = console.nextInt();
        print(x);
    }
    public static void print(int s) {
        System.out.print("let's see... \n your payment will be $" +s+ " in hour");
    }
}

