
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        inTrend.checkNumber(a);
    }

    public static class inTrend {
        public static void checkNumber(int a) {
            if (a < 0 && a%2 == 0) {
                System.out.print("отрицательное четное число");
            }
            else if (a < 0 && a%2 != 0) {
                System.out.print("отрицательное нечетное число");
            }
            else if (a == 0) {
                System.out.print("равно 0");
            }
            else if (a > 0 && a%2 == 0) {
                System.out.print("положительное и четное");
            }
            else if (a > 0 && a%2 != 0) {
                System.out.print("положительное и нечетное");
            }
        }
    }
}







