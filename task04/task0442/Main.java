import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a;
        int sum = 0;
        while ((a = console.nextInt()) != -1) {
            sum += a;
        }
        sum -= 1;
        System.out.print(sum);
    }
    static void sumOfInput(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}










