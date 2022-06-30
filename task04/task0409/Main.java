public class Main {
    public static void main(String[] args) {
        closeToTen.abs(6, 12);
    }
    public static class closeToTen {
        public static int[] abs(int a, int b) {
            int n = 10;
            int count1 = (a < n) ? (n - a) : (a - n);
            int count2 = (b < n) ? (n - b) : (b - n);
            if(count1 > count2) {
                System.out.print(b);
            }
            else if (count1 < count2) {
                System.out.print(a);
            }
            else {
                System.out.print(a);
            }
            return new int[] {count1, count2};
        }
    }
}




