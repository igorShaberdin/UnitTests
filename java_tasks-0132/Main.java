public class Main {
    public static void main(String[] args) {
            System.out.println(sumDigitsInNumber(546));
        }

        public static int sumDigitsInNumber(int number) {
        int sum = 0;
        for (int i=0; i<3; i++) {
            sum += number%10;
            number /= 10;
            }
        return sum;
    }
}