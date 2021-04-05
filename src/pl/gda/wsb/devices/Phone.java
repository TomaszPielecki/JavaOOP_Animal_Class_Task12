package pl.gda.wsb.devices;

public class Phone {
     public String producer;
     public String model;
     public String operationSystem;
     public Double screenSize;
     public String toString() {// toString() method
        return producer + " " + model + " " + operationSystem+ " " + screenSize;
    }
}
