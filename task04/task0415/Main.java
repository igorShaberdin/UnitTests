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
            if ((a + b) > c || (a + c) > b || (b + c) > a) {
                System.out.print("Треугольник существует");
            }
            else {
                System.out.print("Треугольник не существует");
            }
        }
    }
}





