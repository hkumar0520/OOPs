package Animal;

public class Animal {
    String type;
    int size;
    int weight;
    String color;

    public Animal(){
        // call the parametrized constructor
        this("Default", -1, -1, "Default");
    }

    public Animal(String type, int size, int weight, String color){
        System.out.println("Animal parametrized constructor called");
        this.type = type;
        this.size = size;
        this.weight = weight;
        this.color = color;
    }

    public Animal(Animal animal){
        System.out.println("Animal Object constructor called");
        this.type = animal.type;
        this.size = animal.size;
        this.weight = animal.weight;
        this.color = animal.color;
    }

    public void makeSound(){
        System.out.println("Animal is making sound");
    }

    public void makeRun(){
        System.out.println("Animal is Running");
    }
}
