import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int[] arr = new int[3];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        printOut(name, arr);
    }
    static void printOut(String name, int[] arr) {
        System.out.printf("My name is %s.%n", name);
        System.out.printf("I was born in %d.%d.%d", arr[0], arr[1], arr[2]);
    }
}
//313