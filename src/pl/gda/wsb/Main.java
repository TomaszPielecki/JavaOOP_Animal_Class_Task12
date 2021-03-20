package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Dog");
        dog.species = "Spaniel";
        dog.name = "Tosia";
        dog.weight = 5.0;


        Animal dog1 = new Animal("Dog");
        dog1.species = "Bulldog";
        dog1.name = "Klara";
        dog1.weight = 20.0;


        System.out.println("-------Animal-------");
        System.out.println("Name = " + dog.name+",Waga = " + dog.weight+",Rasa = " + dog.species);
        System.out.println("Name = " + dog1.name+",Waga = " + dog1.weight+",Rasa = " + dog1.species);
        System.out.println("-------Human--------");

        Human os1 = new Human();
        os1.firstName="Adam";
        os1.lastName="Kowalski";
        os1.age = 20;
        os1.sex="Male";
        os1.person();

        Human os2 = new Human();
        os2.firstName="Dagmara";
        os2.lastName="Kowalska";
        os2.age = 21;
        os2.sex="Female";
        os2.person();

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

        System.out.println("-------Phone--------");
        System.out.println("Producent = " + tel.producer+",Model = " + tel.model+",System Operation = " + tel.operationSystem +",Rozdzielczość = " + tel.screenSize);
        System.out.println("Producent = " + tel1.producer+",Model = " + tel1.model+",System Operation = " + tel1.operationSystem +",Rozdzielczość  = " + tel1.screenSize);
        System.out.println("--------------------");

        os1.person();
        os2.person();

    }
}