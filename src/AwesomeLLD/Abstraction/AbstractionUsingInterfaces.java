package AwesomeLLD.Abstraction;

interface Animal{
    void makeSound();
}

class Dog implements  Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat meows");
    }
}

public class AbstractionUsingInterfaces {

    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();

        Animal myCat = new Cat();
        myCat.makeSound();
    }
}















