import java.util.ArrayList;

public class Employee {
    private int empID;
    private String firstName;

    private String lastName;

    private String email;

    private ArrayList<Animal> animalsInCare = new ArrayList<>();

    public Employee(int empID, String firstName, String lastName, String email) {
        this.empID = empID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Employee() {
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Animal> getAnimalsInCare() {
        return animalsInCare;
    }

    public void setAnimalsInCare(ArrayList<Animal> animalsInCare) {
        this.animalsInCare = animalsInCare;
    }

    // Methods

    public void addAnimalToEmployeeCare(Animal animal) {
        animalsInCare.add(animal);
    }

    public void removeAnimalFromEmployeeCare(Animal animal) {
        animalsInCare.remove(animal);
    }

    public void printAnimalsInCare() {
        System.out.println("Animals In Care Of: " + this.firstName);
        for (Animal animal : animalsInCare) {
            if(animal instanceof Cat){
                Cat cat = (Cat) animal;
                System.out.println(cat.getName() + " " + cat.getAge() + " " + cat.getHairType());
            } else if(animal instanceof Dog){
                Dog dog = (Dog) animal;
                System.out.println("Dog " + dog.getName() + " " + dog.getAge() + " " + dog.getBreed());
            }

        }
    }


}
