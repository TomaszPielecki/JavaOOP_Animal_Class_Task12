package pl.gda.wsb;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    String sex;
    Animal Animal;
    Car Car;
    public String toString() {// toString() method
        return firstName + " " + lastName + " " + age + " " + sex;
    }
}
