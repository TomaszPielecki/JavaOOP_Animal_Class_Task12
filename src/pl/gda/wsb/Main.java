package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Dog");
        dog.species = "Spaniel Kaszubski";
        dog.name = "Tosia";
        dog.weight = 5.0;
        dog.feed();
        dog.feed();
        dog.feed();

        Animal dog1 = new Animal("Dog");
        dog1.species = "Bulldog Kaszubski";
        dog1.name = "Klara";
        dog1.weight = 20.0;
        dog1.feed();
        dog1.feed();
        dog1.feed();
        // wypisanie informacji z Klasy Animal
        System.out.println("-------Animal-------");
        System.out.println("Name = " + dog.name+",Waga = " + dog.weight+",Rasa = " + dog.species);
        System.out.println("Name = " + dog1.name+",Waga = " + dog1.weight+",Rasa = " + dog1.species);
        System.out.println("-------Human--------");

        Human os1 = new Human();
        os1.firstName="Adam";
        os1.lastName="Kowalski";
        os1.age = 20;
        os1.sex="Male";

        Human os2 = new Human();
        os2.firstName="Dagmara";
        os2.lastName="Kowalska";
        os2.age = 21;
        os2.sex="Female";
        // wypisanie informacji z Klasy Human
        System.out.println("Imie = " + os1.firstName+",Nazwisko = " + os1.lastName+",Wiek = " + os1.age+",Płeć = " + os1.sex);
        System.out.println("Imie = " + os2.firstName+",Nazwisko = " + os2.lastName+",Wiek = " + os2.age+",Płeć = " + os2.sex);

        Phone tel = new Phone();
        tel.producer="Samsung";
        tel.model="s8+";
        tel.operationSystem="Android";
        tel.screenSize=4.2;

        Phone tel1 = new Phone();
        tel1.producer="Samsung";
        tel1.model="s8";
        tel1.operationSystem="Android";
        tel1.screenSize=4.0;
        // wypisanie informacji z Klasy Phone
        System.out.println("-------Phone--------");
        System.out.println("Producent = " + tel.producer+",Model = " + tel.model+",System Operation = " + tel.operationSystem +",Rozdzielczość = " + tel.screenSize);
        System.out.println("Producent = " + tel1.producer+",Model = " + tel1.model+",System Operation = " + tel1.operationSystem +",Rozdzielczość  = " + tel1.screenSize);
        System.out.println("--------------------");

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
        family[0]=os1;
        family[1]=os2;
        // tworzenie petli
        while (x<2){
            System.out.println(family[x].firstName);
            System.out.println(family[x].lastName);
            x=x+1;
        }
        //wypisanie elementow z tablicy
        System.out.println("wypisanie elementu z tablicy:");
        System.out.println(family[0].firstName);
        System.out.println(family[1].lastName);

        // dopisanie 2 elementow do Klasy Human
        Human os3 = new Human();
        os3.firstName="Andrzej";
        os3.lastName="Kowalski";
        os3.age = 24;
        os3.sex="Male";

        Human os4 = new Human();
        os4.firstName="Daria";
        os4.lastName="Kowalska";
        os4.age = 25;
        os4.sex="Female";

        //dodanie do tablicy 2 elementow
        family[2]=os3;
        family[3]=os4;

        // tworzenie petli
        while (x<4){
            System.out.println("Tabela z dodatkowym elementami wynik dla kazdej osoby:");
            System.out.println(family[x].firstName);
            System.out.println(family[x].lastName);
            System.out.println(family[x].age);
            System.out.println(family[x].sex);
            x=x+1;

            Car car1 = new Car();
            car1.Brand="Ford";
            car1.Model="Focus";
            car1.Producer = "General Motor";
            car1.Power=120;
            car1.Color="Zielony";

            Car car2 = new Car();
            car2.Brand="Toyota";
            car2.Model="t25";
            car2.Producer = "Toyota Motor";
            car2.Power=140;
            car2.Color="Bordowy";
        }


    }
}