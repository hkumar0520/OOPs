package AwesomeLLD.Interface;


interface Flyable {
    void fly();
}

interface Drivable {
    void drive();
}

class FlyingCar implements Flyable, Drivable {

    @Override
    public void fly() {
        System.out.println("FlyingCar is flying...");
    }

    @Override
    public void drive(){
        System.out.println("FlyingCar is driving...");
    }
}

public class MultipleInheritanceUsingInterface {
    public static void main(String[] args) {
        FlyingCar myVehicle = new FlyingCar();
        myVehicle.fly();
        myVehicle.drive();
    }
}




















