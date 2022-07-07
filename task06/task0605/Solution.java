import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(input.readLine());
        double high = Double.parseDouble(input.readLine());
        printOut(weight, high);
    }

    public static void printOut(double weight, double high) {
        double index = weight/high*high;

        if (index < 18.5) {
            System.out.print("too small");
        }
        else if (index > 18.5 && index < 24.9) {
            System.out.print("good");
        }
        else if (index > 24.9) {
            System.out.print("too much");
        }
    }
}
