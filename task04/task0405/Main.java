import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        setCatsCount cat = new setCatsCount();
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        setCatsCount.getCats(x);
    }
    public static class setCatsCount {
        static void getCats(int catsCount) {
        System.out.println(catsCount);
        }
    }
}

