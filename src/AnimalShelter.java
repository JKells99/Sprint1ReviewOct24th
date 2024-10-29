import java.util.ArrayList;

public class AnimalShelter {

    private ArrayList<Animal> animals = new ArrayList<>();

    private ArrayList<Employee> employees = new ArrayList<>();

    private ArrayList<Adopter> adopters = new ArrayList<>();



    private int numberOfDogs = 0;

    public AnimalShelter() {
    }

    public ArrayList<Adopter> getAdopters() {
        return adopters;
    }

    public void setAdopters(ArrayList<Adopter> adopters) {
        this.adopters = adopters;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
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

    public void addToAdopters(Adopter adopter) {
        adopters.add(adopter);
    }

    public void addToAnimals(Animal animal) {
        animals.add(animal);
    }

    public void  addToEmployees(Employee employee) {
        employees.add(employee);
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

    public void printEmployeeInShelter(){
        System.out.println("List Of Shelter Employees");
        for(Employee employee : employees){
            System.out.println(employee.getFirstName() + " " + employee.getLastName());
        }
    }

    public void adoptAnimal(Adopter adopter,Animal animal){
        adopter.addAnimalToOwnedList(animal);
        animals.remove(animal);
        System.out.println("Animal Adopted! Woo " + animal.getName());

    }



}
