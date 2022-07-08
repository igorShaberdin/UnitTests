public class Cat {
    int catCount;
    public Cat(int catCount) {
        this.catCount = catCount;
    }
    void print() {
        catCount ++;
        System.out.print(catCount);
    }
}
