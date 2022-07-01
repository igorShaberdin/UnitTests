
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int n = console.nextInt();
        inTrend.checkNumber(str, n);
    }

    public static class inTrend {
        public static void checkNumber(String str, int n) {
            int i = 0;
            if (n > 0) {
                while (i < n) {
                    i++;
                    System.out.println(str);
                }
            }
        }
    }
}







