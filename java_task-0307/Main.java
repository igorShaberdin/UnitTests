public class Main {
    public static void main(String[] args) {
        String tipe = " ";
        printOut(tipe);
    }
    public static void printOut(String l) {
        for (int i = 1; i < 11; i++) {
            Zerg zerg = new Zerg("David", i);
            l = String.valueOf(zerg);
            System.out.println(l);
        }
        for (int i = 1; i < 6; i++) {
            Protos protos = new Protos("John", i);
            l = String.valueOf(protos);
            System.out.println(l);
        }
        for (int i = 1; i < 13; i++) {
            Terran terran = new Terran("Bill", i);
            l = String.valueOf(terran);
            System.out.println(l);
        }
    }
}
