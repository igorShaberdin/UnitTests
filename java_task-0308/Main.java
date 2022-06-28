public class Main {
    public static void main(String[] args) {
        int a = -1;
        printOut(a);
    }

    public static void printOut(int f) {
        f = 1;
        for(int i= 1; i<11; i++){
            f = f*i;
        }
        System.out.print(f);
    }
}