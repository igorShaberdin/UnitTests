import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    static String readString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        return word;
    }

    static int readInt() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        return number1;
    }

    static double readDouble() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double number2 = Double.parseDouble(reader.readLine());
        return number2;
    }

    static boolean readBoolean() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean truth = Boolean.parseBoolean(reader.readLine());
        return truth;
    }

    static void printOut() throws IOException {
        System.out.println(readString());
        System.out.println(readBoolean());
        System.out.println(readDouble());
        System.out.print(readInt());
    }
}
