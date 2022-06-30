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
            int max = Math.max(a, Math.max(b, c));
            int min = Math.min(a, Math.min(b, c));
            int middle = (a + b + c) - (max + min);
            System.out.print(max + " " + middle + " " + min);
        }
    }
}






