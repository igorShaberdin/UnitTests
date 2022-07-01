
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
            if (a > 0 && b > 0 && c > 0) {
                System.out.print("количество положительных чисел: 3 \n" + "количество отрицательных чисел: 0");
            }
            else if ((b > 0 && a > 0) || (a > 0 && c > 0) || (b > 0 && c > 0)) {
                System.out.print("количество положительных чисел: 2 \n" + "количество отрицательных чисел: 1");
            }
            else if (c > 0 || a > 0 || b > 0) {
                System.out.print("количество положительных чисел: 1 \n" + "количество отрицательных чисел: 2");
            }
            else if (c < 0 && a < 0 && b < 0) {
                System.out.print("количество положительных чисел: 0 \n" + "количество отрицательных чисел: 3");
            }
        }
    }
}







