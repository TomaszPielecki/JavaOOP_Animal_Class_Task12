package pl.gda.wsb;

import pl.gda.wsb.devices.Car;
import pl.gda.wsb.devices.Phone;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Dog");
        dog.species = "Spaniel Kaszubski";
        dog.name = "Tosia";
        dog.weight = 5.0;

        Animal dog1 = new Animal("Dog");
        dog1.species = "Bulldog Kaszubski";
        dog1.name = "Klara";
        dog1.weight = 20.0;

        // wypisanie informacji z Klasy Animal
        System.out.println("-------Animal-------");
        System.out.println("Name = " + dog.name + ",Waga = " + dog.weight + ",Rasa = " + dog.species);
        System.out.println("Name = " + dog1.name + ",Waga = " + dog1.weight + ",Rasa = " + dog1.species);
        System.out.println("-------Human--------");


        Human os1 = new Human();
        os1.setSalary(5500.0);
        os1.firstName = "Adam";
        os1.lastName = "Kowalski";
        os1.age = 20;
        os1.sex = "Male";

        Human os2 = new Human();
        os2.firstName = "Dagmara";
        os2.lastName = "Kowalska";
        os2.setSalary(5000.0);
        os2.age = 21;
        os2.sex = "Female";

        // wypisanie informacji z Klasy Human
        System.out.println("Imie = " + os1.firstName + ",Nazwisko = " + os1.lastName + ",Wiek = " + os1.age + ",Płeć = " + os1.sex);
        System.out.println("Imie = " + os2.firstName + ",Nazwisko = " + os2.lastName + ",Wiek = " + os2.age + ",Płeć = " + os2.sex);

        Phone tel = new Phone();
        tel.producer = "Samsung";
        tel.model = "s8+";
        tel.operationSystem = "Android";
        tel.screenSize = 4.2;

        Phone tel1 = new Phone();
        tel1.producer = "Samsung";
        tel1.model = "s8";
        tel1.operationSystem = "Android";
        tel1.screenSize = 4.0;

        // wypisanie informacji z Klasy Phone
        System.out.println("-------Phone--------");
        System.out.println("Producent = " + tel.producer + ",Model = " + tel.model + ",System Operation = " + tel.operationSystem + ",Rozdzielczość = " + tel.screenSize);
        System.out.println("Producent = " + tel1.producer + ",Model = " + tel1.model + ",System Operation = " + tel1.operationSystem + ",Rozdzielczość  = " + tel1.screenSize);
        System.out.println("--------------------");
        dog1.feed();
        dog1.feed();
        dog1.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog1.takeForAWalk();
        dog1.takeForAWalk();
        dog1.takeForAWalk();
        dog1.takeForAWalk();
        dog1.takeForAWalk();
        dog1.takeForAWalk();
        dog1.takeForAWalk();
        // stworzenie tablicy
        System.out.println("wypisanie elementu z tablicy za pomoca petli:");
        Human[] family = new Human[4];
        int x = 0;
        family[0] = os1;
        family[1] = os2;
        // tworzenie petli
        while (x < 2) {
            System.out.println(family[x].firstName);
            System.out.println(family[x].lastName);
            x = x + 1;
        }
        //wypisanie elementow z tablicy
        System.out.println("wypisanie elementu z tablicy:");
        System.out.println(family[0].firstName);
        System.out.println(family[1].lastName);

        // dopisanie 2 elementow do Klasy Human
        Human os3 = new Human();
        os3.firstName = "Andrzej";
        os3.lastName = "Kowalski";
        os3.setSalary(4000.0);
        os3.age = 24;
        os3.sex = "Male";

        Human os4 = new Human();
        os4.firstName = "Daria";
        os4.lastName = "Kowalska";
        os4.setSalary(2500.0);
        os4.age = 25;
        os4.sex = "Female";

        //dodanie do tablicy 2 elementow
        family[2] = os3;
        family[3] = os4;

        // tworzenie petli
        while (x < 4) {
            System.out.println("Tabela z dodatkowym elementami wynik dla kazdej osoby:");
            System.out.println(family[x].firstName);
            System.out.println(family[x].lastName);
            System.out.println(family[x].age);
            System.out.println(family[x].sex);
            x = x + 1;
        }
        // przypisanie Animal do human
        os3.Animal = dog;
        os4.Animal = dog1;

        Car car1 = new Car();
        car1.Brand = "Ford";
        car1.Model = "Focus IV";
        car1.Producer = "General Motor";
        car1.setValue(55000.0);
        car1.Power = 120;
        car1.Color = "Zielony";

        Car car2 = new Car();
        car2.Brand = "Toyota";
        car2.Model = "t27";
        car2.Producer = "Toyota Motor";
        car2.setValue(60000.0);
        car2.Power = 140;
        car2.Color = "Bordowy";
        //przypisanie osob do samochodu.
        os1.Car = car1;
        os2.Car = car2;

        System.out.println("-------------------------------------------------------");
        // Przypisanie Zwierzecia-Animal do Osoby Human
        System.out.println("Imie = " + os3.firstName + ",Nazwisko = " + os3.lastName + ",Rasa = " + os3.Animal.species + ",Imie = " + os3.Animal.name + ",Waga = " + os3.Animal.weight);
        System.out.println("Imie = " + os4.firstName + ",Nazwisko = " + os4.lastName + ",Rasa = " + os4.Animal.species + ",Imie = " + os4.Animal.name + ",Waga = " + os4.Animal.weight);
        System.out.println("-------------------------------------------------------");
        // Przypisanie do osoby-Human  Samochodu- Car.
        System.out.println("Imie = " + os1.firstName + ",Nazwisko = " + os1.lastName + ",Marka Samochodu = " + os1.Car.Brand + ",Model = " + os1.Car.Model + ",Producent = " + os1.Car.Producer + ",KM = " + os1.Car.Power + ",Kolor = " + os1.Car.Color);
        System.out.println("Imie = " + os2.firstName + ",Nazwisko = " + os2.lastName + ",Marka Samochodu = " + os2.Car.Brand + ",Model = " + os2.Car.Model + ",Producent = " + os2.Car.Producer + ",KM = " + os2.Car.Power + ",Kolor = " + os2.Car.Color);

        System.out.println("------------------Enum porownanie-----------------");

        // Enum
        System.out.println("Enum - Marka Auta " + car2.Brand + " czy jest rowne marce " + car1.Brand);
        if (os1.Car.Brand.equals(os2.Car.Brand)) System.out.println("True");
        else System.out.println("False");
        System.out.println("------------------Equals and Hashcode-------------");
        // porownanie Equals oraz Hashcode
        System.out.println("car1.equals(car2): " + car1.equals(car2)); // false
        System.out.println("car1.equals(null): " + car1.equals(null)); // false
        System.out.println("car2.equals(null): " + car2.equals(null)); // false
        System.out.println("car2.equals(car2): " + car2.equals(car2)); // true
        System.out.println("car1.equals(car1): " + car1.equals(car1)); // true

        System.out.println("-----------------ToString All Class---------------");
        //toString
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(dog);
        System.out.println(dog1);
        System.out.println(os1);
        System.out.println(os2);
        System.out.println(tel);
        System.out.println(tel1);
        System.out.println("-----------------Pakage----Zad 8------------------");
        System.out.println("Paczki utworzone pakage - devices");
        System.out.println("-----------------Gettery i Settery----Zad 9-------");

        System.out.println("osoba 1 zarabia  -> " + os1.getSalary());
        System.out.println("osoba 2 zarabia  -> " + os2.getSalary());
        System.out.println("osoba 3 zarabia  -> " + os3.getSalary());
        System.out.println("osoba 4 zarabia  -> " + os4.getSalary());


        if(os4.getSalary >= 0 || os3.getSalary < 0 ) System.out.println("Bład! Nie mozna samowolnie podniesc sobie wypłaty");
        else
        {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego!");
            System.out.println("Konieczność odebrania aneksu do umowy od pani Hani z kadr!");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu!");
        }

        os3.setSalary(-680.0);
        os4.setSalary(1400.0);



        System.out.println("-----------------Gettery i Settery----Zad 10------");

        System.out.println("Samochod Ford Focus IV kosztuje  -> " + car1.getValue());
        System.out.println("Samochod Toyota t27 kosztuje     ->" + car2.getValue());

        if (os1.getSalary() >= car2.getValue()) {
            System.out.println("Udalo sie kupic za gotowke.");
        } else if (os1.getSalary() >= car2.getValue() / 12.0) {
            System.out.println("Udalo sie kupic auto na kredyt.");
        } else {
            System.out.println("Nie stac cie na ten samochod");
        }
        os1.Car = car1;
        System.out.println("Udalo sie kupic auto na kredyt."+ os1.Car);

    }
}