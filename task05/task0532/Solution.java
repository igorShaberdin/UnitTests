import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        printOut();
    }

    public static void printOut() {
        Scanner console = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int x = console.nextInt();
        int y = 0;
        if (x > 0) {
            for (int i = 0; i < x; i++) {
                y = console.nextInt();
                if (max < y)
                    max = y;
            }
            System.out.print(max);
        }
    }

    public static void sumOfInput(int x, int y) {
        System.out.print(Math.max(x, y));
    }
}
