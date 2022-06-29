public class Colors {
    String title;

    public Colors(String title) {
        this.title = title;
        System.out.println(title);
    }

    @Override
    public String toString() {
        return "Colors{" +
                "title='" + title + '\'' +
                '}';
    }
}
