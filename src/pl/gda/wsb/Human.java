package pl.gda.wsb;

import pl.gda.wsb.devices.Car;

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
