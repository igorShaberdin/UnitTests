public class Cat {
    protected void finalize() throws Throwable {
        System.out.println("Stranger");
    }
}
