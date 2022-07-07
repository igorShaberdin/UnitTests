public class Cat {
    static int catCount;
    Cat() {
        System.out.println(catCount += 1);
    }
    @Override
    protected void finalize() {
        System.out.println(catCount -= 1);
    }
}
