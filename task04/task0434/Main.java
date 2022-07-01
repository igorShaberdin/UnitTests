

public class Main {
    public static void main(String[] args) {
        inTrend.checkNumber();
    }

    public static class inTrend {
        public static void checkNumber() {
            int j = 1;
            while (j < 11) {
                int i = 0;
                while (i < 10) {
                    i++;
                    System.out.print(i*j + " ");
                }
                j++;
                System.out.println();
            }
        }
    }
}







