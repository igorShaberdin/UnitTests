

public class Main {
    public static void main(String[] args) {
        inTrend.checkNumber();
    }

    public static class inTrend {
        public static void checkNumber() {
            for (int i = 1; i < 101; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}







