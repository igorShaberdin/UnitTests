public class Main {
    public static void main(String[] args) {
        int a = 1;
        printOut(a);
    }

    public static void printOut(int f) {
        f = 0;
        for(int i= 0; i<10; i++){
            f = f+i+1;
        }
        System.out.print(f);
    }
}