import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        inTrend.checkNumber(a);
    }

    public static class inTrend {
        public static void checkNumber(int a) {
            if(a == 1) {
                System.out.print("Monday");
            }
            else if(a == 2 ) {
                System.out.print("Tuesday");
            }
            else if(a == 3 ) {
                System.out.print("Wednesday");
            }
            else if(a == 4 ) {
                System.out.print("Thursday");
            }
            else if(a == 5 ) {
                System.out.print("Friday");
            }
            else if(a == 6 ) {
                System.out.print("Saturday");
            }
            else if(a == 7 ) {
                System.out.print("Sunday");
            }
            else {
                System.out.print("There is no week's day");
            }
        }
    }
}




