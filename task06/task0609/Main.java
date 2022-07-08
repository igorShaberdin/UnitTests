import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static double x;
    static double y;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x1 = Integer.parseInt(reader.readLine());
        double y1 = Integer.parseInt(reader.readLine());
        double x2 = Integer.parseInt(reader.readLine());
        double y2 = Integer.parseInt(reader.readLine());
        getX(x1, x2);
        getY(y1, y2);
        printOut();
    }

    static double getX(double x1, double x2) {
        if ((x1 > 0 && x2 > 0) && x1 > x2) {
            x = x1 - x2;
        } else if ((x1 > 0 && x2 > 0) && x2 > x1) {
            x = x2 - x1;
        } else System.out.print("You wrong");
        return x;
    }

    static double getY(double y1, double y2) {
        getX(y1, y2);
        return y;
    }

    static double getDistance() {
        double result = Math.sqrt(x) + Math.sqrt(y);
        return result;
    }

    static void printOut() {
        System.out.print(getDistance());
    }
}
//313