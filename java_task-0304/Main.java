public class Main {
    public static void main(String[] args) {
        System.out.println(addTenPercent(150));
    }
    public static double addTenPercent(int percent){
        double count = percent*0.1;
        return percent+count;
    }
}