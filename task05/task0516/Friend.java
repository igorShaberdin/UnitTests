public class Friend {
    private String name;
    private int age;
    private char sex;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void init1 (String name) {
        this.name = name;
        System.out.print(name);
    }
    public void init2 (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void init3 (String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
