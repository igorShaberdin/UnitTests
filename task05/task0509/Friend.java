public class Friend {
    private String name;
    private int age;
    private char sex;

    public void name (String name) {
        this.name = name;
        System.out.println(name);
    }
    public void nAge (String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }
    public void all (String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println(name + " " + age + " " + sex);
    }

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
}
