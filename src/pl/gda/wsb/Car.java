package pl.gda.wsb;

public class Car {

    String Brand;
    String Model;
    String Producer;
    Integer Power;
    String Color;


    // porownanie w obrebie klasy Car
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car otherCar = (Car) obj;
            return Brand.equals(otherCar.Brand) &&
                    Model.equals(otherCar.Model) &&
                    Producer.equals(otherCar.Producer);
        }
        return false;

    }
    // HashCode wychodzi tak samo jak Equals
    @Override
    public int hashCode() {
        return Brand.hashCode() + Model.hashCode() + Producer.hashCode();
    }
    public String toString(){// toString() method
        return Brand+" "+Model+" "+Producer+" "+Power+" "+Color;
    }
}








