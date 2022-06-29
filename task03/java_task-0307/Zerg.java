public class Zerg {
    String name;
    int id = 1;
    public Zerg (String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Zerg{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}