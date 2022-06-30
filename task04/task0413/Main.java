
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        inTrend.checkNumber(a);
    }

    public static class inTrend {
        public static void checkNumber(int a) {
            switch (a) {
                case 1:
                    System.out.print("Monday");
                    break;
                case 2:
                    System.out.print("Tuesday");
                    break;
                case 3:
                    System.out.print("Wednesday");
                    break;
                case 4:
                    System.out.print("Thursday");
                    break;
                case 5:
                    System.out.print("Friday");
                    break;
                case 6:
                    System.out.print("Saturday");
                case 7:
                    System.out.print("Sunday");
                    break;
            }
            if (a > 7 || a < 0){
                System.out.print("There is no week's day");
            }
        }
    }
}







