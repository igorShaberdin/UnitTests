import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numb = console.nextInt();
        printOut(numb);

    }

    public static void printOut(int numb) {
        int odd = 0;
        int even = 0;
        while (numb > 0) {
            if ((numb % 10) % 2 == 0) {
                even++;
            }
            else odd++;
            numb /= 10;
        }
        System.out.print("Even: " + even + " Odd: " + odd);
    }
}
