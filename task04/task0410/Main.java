public class Main {
    public static void main(String[] args) {
        inTrend.checkInterval(60);
    }

    public static class inTrend {
        public static int checkInterval(int a) {
            if (a < 100 && a > 50) {
                System.out.print("The number " + a + " is in interval");
            } else {
                System.out.print("The number " + a + " is not in interval");
            }
            return a;
        }
    }
}




