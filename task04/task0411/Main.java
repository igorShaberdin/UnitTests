public class Main {
    public static void main(String[] args) {
        inTrend.checkSeason(-41);
    }

    public static class inTrend {
        public static int checkSeason(int a) {
            if(a <= 5 && a >= 3) {
                System.out.print("Spring");
            }
            else if(a <= 8 && a >= 6 ) {
                System.out.print("Summer");
            }
            else if(a <= 11 && a >= 9) {
                System.out.print("Autumn");
            }
            else if((a > 0 && a <= 2) || a == 12) {
                System.out.print("Winter");
            }
            else {
                System.out.println("You wrong, not a month's number ");
            }
            return a;
        }
    }
}




