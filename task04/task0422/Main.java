
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = console.nextInt();
        inTrend.checkNumber(name, age);
    }

    public static class inTrend {
        public static void checkNumber(String name, int age) {
            if (age < 18) {
                System.out.print("Grow up, kid");
            }
        }
    }
}







