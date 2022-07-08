import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numb = console.nextInt();
        printOut(numb);

    }

    public static void printOut(int numb) {
        Cat cat = new Cat(numb);
        cat.print();
        System.out.print(cat.getCatCount(5));
    }
}

