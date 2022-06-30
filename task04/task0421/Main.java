import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name1 = console.nextLine();
        String name2 = console.nextLine();
        inTrend.checkNumber(name1, name2);
    }

    public static class inTrend {
        public static void checkNumber(String a, String b) {
            boolean compare = a.equals(b);
            if (compare) {
                System.out.print("Names the same");
            }
            StringBuilder name1 = new StringBuilder(a);
            int y = name1.length();
            StringBuilder name2 = new StringBuilder(b);
            int x = name2.length();
            if ((y == x) && (!a.equals(b))) {
                System.out.print("Name's length the same");
            }
        }
    }
}







