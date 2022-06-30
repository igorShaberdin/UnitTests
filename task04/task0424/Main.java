
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        inTrend.checkNumber(a, b, c);
    }

    public static class inTrend {
        public static void checkNumber(int a, int b, int c) {
            if (a != b && a == c) {
                System.out.print(b);
            }
            else if (c != a && c == b) {
                System.out.print(a);
            }
            else if (b != c && b == a) {
                System.out.print(c);
            }
        }
    }
}







