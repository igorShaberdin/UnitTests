import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        inTrend.checkNumber(a);
    }

    public static class inTrend {
        public static void checkNumber(int a) {
            if((a % 4 == 0) && (a % 400 == 0)) {
                System.out.print("Високосный год");
            }
            else {
                System.out.print("Не високосный");
            }
            }
        }
    }





