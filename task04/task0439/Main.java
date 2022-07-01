import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        inTrend.checkNumber(name);
    }
    public static class inTrend {
        public static void checkNumber(String s) {
            for (int i = 0; i < 10; i++) {
                System.out.println(s + " loves you");
            }
        }
    }
}







