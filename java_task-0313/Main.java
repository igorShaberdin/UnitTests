public class Main {
    public static void main(String[] args) {
        String v = "Мам";
        String f = "Мыл";
        String z = "Рам";
        printOut(v, f, z);
    }
    public static void printOut(String a, String b, String c) {
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
//313