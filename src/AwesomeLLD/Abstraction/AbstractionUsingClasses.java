package AwesomeLLD.Abstraction;

abstract class Vehicle {
    String brand;

    Vehicle(String brand){
        this.brand = brand;
    }

    abstract void start();

    void displayBrand(){
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle{
    Car(String brand){
        super(brand);
    }

    @Override
    void start(){
        System.out.println("Car is starting...");
    }
}


public class AbstractionUsingClasses {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota");
        myCar.displayBrand();
        myCar.start();
    }
}













