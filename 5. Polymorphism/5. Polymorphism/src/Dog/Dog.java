package Dog;

import Animal.Animal;

public class Dog extends Animal {
    String breed;
    int legs;

    public Dog(){
        super("Dog", -1, -1, "Default");
        this.breed = "Default";
        this.legs = -1;
    }

    public Dog(int size, int weight, String color, String breed, int legs){
        super("Dog", size, weight, color);

        // call to super must be first statement in constructor only
        System.out.println("Dog parametrized constructor called");
        this.breed = breed;
        this.legs = legs;
    }

    public Dog(Dog dog){
        super(dog);
        System.out.println("Dog Object constructor called");
        this.breed = dog.breed;
        this.legs = dog.legs;
    }

    public void makeSound(){
        System.out.println("Dog is Bark");
    }

    public void makeRun(){
        System.out.println("Dog is Running");
    }
}
