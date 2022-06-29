
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Age is: " + Person.age);
        Person.adjustAge(Person.age);
        System.out.println("Adjusted Age is: " + Person.age);
    }

    public static class Person {
        public static int age = 20;

        public static void adjustAge(int age) {
            Person.age = age + 20;
            System.out.println("The Age in adjustAge() is " + age);
        }
    }
}

