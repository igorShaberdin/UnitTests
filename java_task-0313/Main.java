
public class Main {
    public static void main(String[] args) {
        String a = "Мама";
        String b = "Мыла";
        String c = "Раму";
        String temp;
        for (int i = 0; i < 6; i++) {
            temp = a;
            a = b;
            b = c;
            c = temp;
            System.out.println(a + b + c);
        }


    }
}

