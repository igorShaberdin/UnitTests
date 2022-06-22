public class Main {

    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static int getVolume(int a, int b, int c) {
        int volume = a * b * c*1000;
        int vol = 0;
         if (volume > 0)
             vol = volume;
        return vol;
    }
}