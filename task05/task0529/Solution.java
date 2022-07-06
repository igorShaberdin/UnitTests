import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        printOut();
    }
    public static void printOut() throws IOException {
        BufferedReader numbers = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int sum = 0;
        while(!(line = numbers.readLine()).equals("sum")) {
            sum += Integer.valueOf(line);
        }
        System.out.print(sum);
    }
    public static void sumOfInput(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print(sum);
    }
}
