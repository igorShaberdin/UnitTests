
public class Main {
    public static void main(String[] args) {
        System.out.println(convertToSeconds(24));
        System.out.println(convertToSeconds(3));
    }

    public static int convertToSeconds(int hour) {
        return (hour * 3600);
    }
}

