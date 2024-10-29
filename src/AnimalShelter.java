import java.util.ArrayList;

public class AnimalShelter {

    private ArrayList<Animal> animals = new ArrayList<>();

    private int numberOfDogs = 0;

    public AnimalShelter() {
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfDogs() {
        return numberOfDogs;
    }

    public void setNumberOfDogs(int numberOfDogs) {
        this.numberOfDogs = numberOfDogs;
    }

    // Methods
    public void addToAnimals(Animal animal) {
        animals.add(animal);
    }

    public void printAnimalsInShelter(){
        for(Animal animal : animals){
            if(animal instanceof Cat){
                Cat cat = (Cat)animal;
                System.out.println("Cat Name: " + cat.getName());
                System.out.println("Cat Hair Type: " + cat.getHairType());
                System.out.println();
            } else if(animal instanceof Dog){
                Dog dog = (Dog)animal;
                System.out.println(dog.getName());
                System.out.println(dog.getBreed());
                System.out.println();
            }

        }
    }



}
