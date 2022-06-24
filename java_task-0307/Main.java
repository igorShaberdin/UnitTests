public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Zerg zerg = new Zerg("David", i);
            System.out.println(zerg);
        }
        for (int i = 1; i < 6; i++) {
            Protos protos = new Protos("John", i);
            System.out.println(protos);
        }
        for (int i = 1; i < 13; i++) {
            Terran terran = new Terran("Bill", i);
            System.out.println(terran);
        }
    }
}
