public class Main {
    public static void main(String[] args) {
        number.compare(6);
    }
    public static class number {
        public static void compare(int a) {
            if (a < 5) {
                System.out.print("Число меньше 5");
            } else if (a > 5) {
                System.out.print("Число больше 5");
            } else {
                System.out.print("Число равно 5");
            }
        }
    }
}




