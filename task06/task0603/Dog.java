public class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("The object Dog destroyed");
    }
}
