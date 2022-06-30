import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        System.out.print(Cat.catCount);
    }
    public static class Cat {
        static int catCount;
        Cat(){
            catCount++;
        }
    }
}



