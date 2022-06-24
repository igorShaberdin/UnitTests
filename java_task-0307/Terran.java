public class Terran {
    String name;
    int id;
    public Terran(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Terran{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
