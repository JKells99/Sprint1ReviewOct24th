import java.util.ArrayList;

public class Adopter {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

   private ArrayList<Animal> animalsTheyHaveAdopted = new ArrayList<Animal>();

    public Adopter(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<Animal> getAnimalsTheyHaveAdopted() {
        return animalsTheyHaveAdopted;
    }

    public void setAnimalsTheyHaveAdopted(ArrayList<Animal> animalsTheyHaveAdopted) {
        this.animalsTheyHaveAdopted = animalsTheyHaveAdopted;
    }

    //Methods
     public void addAnimalToOwnedList(Animal animal) {
        animalsTheyHaveAdopted.add(animal);
     }

     public void removeAnimalFromOwnedList(Animal animal) {
        animalsTheyHaveAdopted.remove(animal);
     }
     public void printAnimals() {
         System.out.println("Animals Owned By " + firstName + " " + lastName);
        for (Animal animal : animalsTheyHaveAdopted) {
            if(animal instanceof Cat){
                Cat cat = (Cat) animal;
                System.out.println(cat.getName() + " " + cat.getAge());

            } else if(animal instanceof Dog){
                Dog dog = (Dog) animal;
                System.out.println(dog.getName() + " " + dog.getAge());
            }
        }
     }
}
