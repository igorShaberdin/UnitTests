
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        inTrend.checkNumber(a, b);
    }

    public static class inTrend {
        public static void checkNumber(int a, int b) {
            if (a > 0 && b > 0) {
                System.out.print(1);
            }
            else if (a < 0 && b > 0) {
                System.out.print(2);
            }
            else if (a < 0 && b < 0) {
                System.out.print(3);
            }
            else if (a > 0 && b < 0) {
                System.out.print(4);
            }
        }
    }
}







