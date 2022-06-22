import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(35, 0));
    }

    public static double convertEurToUsd(double Euro, double Dollar) {
        double course = 1.05;
        Dollar = Euro * course;
        return Dollar;


    }
}