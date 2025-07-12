package Cat;

import Animal.Animal;
import Dog.Dog;

public class Cat extends Animal {
    String breed;
    int legs;

    public Cat(){
        super("Cat", -1, -1, "Default");
        this.breed = "Default";
        this.legs = -1;
    }

    public Cat(int size, int weight, String color, String breed, int legs){
        super("Cat", size, weight, color);
        System.out.println("Cat parametrized constructor called");
        this.breed = breed;
        this.legs = legs;
    }

    public Cat(Cat cat){
        super(cat);
        System.out.println("Cat Object constructor called");
        this.breed = cat.breed;
        this.legs = cat.legs;
    }

    @Override
    public void makeSound(){
        System.out.println("Cat is Meow");
    }

//    @Override
//    public void makeRun(){
//        System.out.println("Cat is Running");
//    }
}
