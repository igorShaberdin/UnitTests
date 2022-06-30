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
            int min = Math.min(a, b);
            System.out.print(min);
            }
        }
    }






