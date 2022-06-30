import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        int d = console.nextInt();
        inTrend.checkNumber(a, b, c, d);
    }
    public static class inTrend {
        public static void checkNumber(int a, int b, int c, int d) {
            int max = Math.max(a, Math.max(b, Math.max(c, d)));
            System.out.print(max);
            }
        }
    }






