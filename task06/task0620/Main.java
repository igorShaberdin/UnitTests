import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        printAnswer(number, number2);
    }
        public static void printAnswer(int a, int b) {
        int max = Math.max(a, b);
        System.out.print("Max is " + max);
        }
    }












