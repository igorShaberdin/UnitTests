
import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        inTrend.checkNumber(a);
    }

    public static class inTrend {
        public static void checkNumber(int a) {
            int v = String.valueOf(a).length();
            if (v == 1 && a%2 == 0) {
                System.out.print("четное однозначное число");
            }
            else if (v == 1 && a%2 != 0) {
                System.out.print("нечетное однозначное число");
            }
            else if (v == 2 && a%2 == 0) {
                System.out.print("четное двузначное число");
            }
            else if (v == 2 && a%2 != 0) {
                System.out.print("нечетное двузначное число");
            }
            else if (v == 3 && a%2 == 0) {
                System.out.print("четное трехзначное число");
            }
            else if (v == 3 && a%2 != 0) {
                System.out.print("нечетное трехзначное число");
            }
            else {
                System.out.print("wrong");
            }
        }
    }
}







