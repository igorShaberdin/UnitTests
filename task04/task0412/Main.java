import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        inTrend.checkNumber(a);
    }

    public static class inTrend {
        public static void checkNumber(int a) {
            if(a > 0) {
                System.out.print(a*2);
            }
            else if(a < 0 ) {
                System.out.print(a+1);
            }
            else {
                System.out.print(a);
            }
        }
    }
}




