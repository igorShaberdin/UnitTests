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
            if(a==b) {
                System.out.print(a + " " + b);
            }
            else if(a == c) {
                System.out.print(a + " " + c);
            }
            else if(b == c) {
                System.out.print(b + " " + c);
            }
            else if((a = b) == c) {
                System.out.print(a + " " + b + " " + c);
            }
        }
    }
}





