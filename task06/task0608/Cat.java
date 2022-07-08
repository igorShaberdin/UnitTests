public class Cat {
    int catCount;

    public int getCatCount(int catCount) {
        return catCount;
    }

    public void setCatCount(int catCount) {
        if (catCount > 0) {
            this.catCount = catCount;
        }
        else {
            System.out.println("You wrong, negative number");
        }
    }

    public Cat(int catCount) {
        this.catCount = catCount;
    }
    void print() {
        catCount ++;
        System.out.println(catCount);
    }
}
