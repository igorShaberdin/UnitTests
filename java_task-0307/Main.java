public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Zerg zerg = new Zerg("");
            String a = String.valueOf(zerg);
            System.out.println(a);
        }
        for (int i = 0; i < 5; i++) {
            Protos protos = new Protos("");
            String b = String.valueOf(protos);
            System.out.println(b);
        }
        for (int i = 0; i < 12; i++) {
            Terran terran = new Terran("");
            String s = String.valueOf(terran);
            System.out.println(s);
        }
    }
}