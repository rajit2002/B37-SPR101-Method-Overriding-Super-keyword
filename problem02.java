class Animal {
    String name;
    String species;
    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal {
    String breed;
    public Dog(String name, String species, String breed) {
        super(name, species);
        this.breed = breed;
    }
    public void makeSound() {
        super.makeSound();
        System.out.println("Bark! Bark!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Generic Animal", "Unknown Species");
        myAnimal.makeSound();

        Dog myDog = new Dog("Buddy", "Canine", "Golden Retriever");
        myDog.makeSound();
    }
}
