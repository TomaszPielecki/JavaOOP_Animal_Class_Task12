package pl.gda.wsb;

import pl.gda.wsb.devices.Car;

public class Human {
    private double salary;
    String firstName;
    String lastName;
    Integer age;
    String sex;
    Animal Animal;
    Car Car;
    // // if I only extract data for salary then create constructor and set and get for salary because that's all I need
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    public String toString() {// toString() method
        return firstName + " " + lastName + " " + age + " " + sex;
    }
}