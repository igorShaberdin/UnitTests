
public class Main {
    public static void main(String[] args) {
        String a = " ";
        printOut(a);
    }
    public static void printOut(String a) {
        for(int i=1; i<11; i++) {
            for(int j=1; j<11; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
