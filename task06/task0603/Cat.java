public class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("The object Cat destroyed");
    }
}
