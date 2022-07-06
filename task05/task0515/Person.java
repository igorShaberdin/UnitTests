public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;
    public void person (String name, int money, char sex, int weight, double size) {
        this.name = name;
        this.money = money;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
        System.out.print("name: " + name + " money: " +  money);
    }
}
