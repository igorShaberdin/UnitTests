import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
        inTrend.checkNumber(m, n);
    }

    public static class inTrend {
        public static void checkNumber(int m, int n) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(8);
                }
                System.out.println();
            }
        }
    }
}







