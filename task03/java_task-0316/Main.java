public class Main {
    public static void main(String[] args) {
        String str = "\"C:\\Program Files\\Java\\jdk1.7.0\\bin\"";
        String str1 = "\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\"";
        printOut(str, str1);
    }
        public static void printOut(String str, String str1) {
            System.out.println("It's Windows path: "+str);
            System.out.print("It's Java string: "+str1);
        }
    }
