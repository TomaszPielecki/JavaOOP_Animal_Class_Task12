package pl.gda.wsb.devices;

public class Car {

    public String Brand;
    public String Model;
    public String Producer;
    public Integer Power;
    public String Color;
    private double value;

    // if I only extract data for salary then create constructor and set and get for salary because that's all I need
    public void setValue(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }


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
    // HashCode wchodzi tak samo jak Equals
    @Override
    public int hashCode() {
        return Brand.hashCode() + Model.hashCode() + Producer.hashCode();
    }
    public String toString(){// toString() method
        return Brand+" "+Model+" "+Producer+" "+Power+" "+Color;
    }
}
