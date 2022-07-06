import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        printOut();
    }
    public static void printOut() {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        int b = console.nextInt();
        int v = console.nextInt();
        int z = console.nextInt();
        int min = Math.min(x,(Math.min(y,(Math.min(b,(Math.min(v,z)))))));
        System.out.print(min);
    }
    public static void sumOfInput(int x, int y) {
        System.out.print(Math.min(x, y));
    }
}
