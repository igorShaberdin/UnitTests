import java.util.Scanner;

public class Main {
        int seconds;
        int b;

        public int getSeconds() {
            return seconds;
        }

        public void setSeconds(int seconds) {
            this.seconds = seconds;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public Main(int seconds, int b) {
            this.seconds = seconds;
            this.b = b;

        }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int seconds = console.nextInt();
        int b = 0;
        if (seconds > 3600) {
            b = seconds;
        }
        System.out.println(b - (b / 3600) * 3600);


    }
}