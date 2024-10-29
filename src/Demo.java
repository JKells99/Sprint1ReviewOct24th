public class Demo {

    public static void main(String[] args) {



        Cat cat = new Cat("Billy",3,"Long Hair");
        Cat cat1 = new Cat("Miley",7,"Short Hair");

        Dog dog = new Dog("Dog",4,"Pitbull");
        Dog dog1 = new Dog("Dog The Bounty Hunter",69,"Bounty Hunter");


        AnimalShelter shelter = new AnimalShelter();

        shelter.addToAnimals(cat1);
        shelter.addToAnimals(cat);

        shelter.addToAnimals(dog);
        shelter.addToAnimals(dog1);

        shelter.printAnimalsInShelter();













    }
}
