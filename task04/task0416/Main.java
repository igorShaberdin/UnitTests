import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        inTrend.checkNumber(a);
    }

    public static class inTrend {
        public static void checkNumber(int a) {
            if((a%5) <= 2) {
                System.out.print("Green");
            }
            else if((a%5) <= 3) {
                System.out.print("Orange");
            }
            else {
                System.out.print("Red");
            }
        }
    }
}





