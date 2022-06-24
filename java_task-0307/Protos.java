public class Protos {
    String name;
    int id = 1;

    public Protos(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Protos{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
