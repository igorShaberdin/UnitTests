public class StringHelper {
    static String multiply(String s, int count) {
        for (int i = 0; i <= count; i++) {
            System.out.println(s);
        }
        return s;
    }

    static String multiply(String s) {
        for (int i = 0; i < 6; i++) {
            System.out.print(s);
        }
        return s;
    }
}
