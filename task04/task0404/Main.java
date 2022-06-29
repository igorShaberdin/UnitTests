
public class Main {
    public static void main(String[] args) {
        addNewCat cat = new addNewCat();
        addNewCat.getCats(0);
        addNewCat.getCats(1);
    }
    public static class addNewCat {
        static void getCats(int catsCount) {
            catsCount++;
        System.out.println(catsCount);
        }
    }
}

