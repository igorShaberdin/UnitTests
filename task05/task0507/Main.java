import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int number;
        int count = 0;
        int sum = 0;
        while ((number = Integer.valueOf(input.readLine())) != -1) {
            sum += number;
            count++;
        }
        numbers(sum, count);
    }
    public static void numbers(int sum, int count) throws IOException {
        System.out.print((double) sum/count);
    }
}
