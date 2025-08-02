package AwesomeLLD.Interface;

interface Animal {
    void sound();


    default void sleep() {
        System.out.println("Sleeping...");
    }

    static int add(int a, int b){
        return a + b;
    }
}

class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
}

public class StaticAndDefaultMethods {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
        myDog.sleep();

        System.out.println(Animal.add(5,8));
    }
}


















