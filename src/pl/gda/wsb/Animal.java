package pl.gda.wsb;

public class Animal {
     String species;
     String name;
     Double weight;

    static public final Double DEFAULT_ANIMAL_WEIGHT = 20.0;

    Animal(String species) {
        this.species = species;

        switch (this.species) {
            case "Dog" -> this.weight = 20.0;
            case "Sheep" -> this.weight = 60.0;
            case "Horse" -> this.weight = 1000.0;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public void feed() {
        if(weight > 0){
            this.weight += 1;
            System.out.println("dzięki za jedzenie. Moja waga jest teraz: " + this.weight);
        }else {
            System.out.println("za późno, przepraszam");
        }
    }

    public void takeForAWalk() {
        if(this.weight > 0){
            this.weight -= 1;
            System.out.println("Dzięki za spacer, moja waga jest teraz" + this.weight);
        } else {
            System.out.println("Nie można chodzić po ulicy z martwym zwierzęciem!");
        }
    }
    public String toString() {// toString() method
        return species + " " + name + " " + weight;
    }
}