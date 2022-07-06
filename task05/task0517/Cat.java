public class Cat {
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public void inicial1(String name) {
        this.name = name;
        weight = 3;
        color = "black";
        age = 3;
        System.out.println("Name: " + name + " weight: " + weight + " color: " + color + " age: " + age + " address: " + address);
    }

    public void initial2(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "black";
        System.out.println("Name: " + name + " weight: " + weight + " color: " + color + " age: " + age + " address: " + address);
    }

    public void initial3(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 3;
        color = "black";
        System.out.println("Name: " + name + " weight: " + weight + " color: " + color + " age: " + age + " address: " + address);
    }

    public void initial4(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = 3;
        System.out.println("Name: " + name + " weight: " + weight + " color: " + color + " age: " + age + " address: " + address);
    }

    public void initial5(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 3;
        System.out.println("Name: " + name + " weight: " + weight + " color: " + color + " age: " + age + " address: " + address);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.print("you wrong, the weight can't be < 0");
        }
    }

    public void setColor(String color) {
        if (color.equals(" ")) {
            color = "black";
        }
        else
            this.color = color;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.print("wrong, the age must be > 0");
        }


    }
}

