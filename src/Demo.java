public class Demo {

    public static void main(String[] args) {


        Cat cat = new Cat("Billy",3,"Long Hair");
        Cat cat1 = new Cat("Miley",7,"Short Hair");

        Dog dog = new Dog("Dog",4,"Pitbull");
        Dog dog1 = new Dog("Dog The Bounty Hunter",69,"Bounty Hunter");

        Employee john = new Employee(1,"John","Billy","j_j@j.com");
        Adopter jordan = new Adopter("Jordan","Kelloway",25,"Male");


        john.addAnimalToEmployeeCare(cat1);
        AnimalShelter shelter = new AnimalShelter();
        shelter.addToEmployees(john);
        shelter.addToAnimals(cat1);
        shelter.addToAnimals(cat);

        shelter.addToAnimals(dog);
        shelter.addToAnimals(dog1);

        john.printAnimalsInCare();

        shelter.printAnimalsInShelter();

        shelter.printEmployeeInShelter();

        shelter.adoptAnimal(jordan,cat1);

        shelter.printAnimalsInShelter();

        jordan.printAnimals();





















    }
}
