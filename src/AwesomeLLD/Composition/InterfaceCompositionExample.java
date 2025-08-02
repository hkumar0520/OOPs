package AwesomeLLD.Composition;

interface Enginee{
    void start();
}

class PetrolEngine implements Enginee{

    public void start(){
        System.out.println("Petrol Engine Started.");
    }
}

class DieselEngine implements Enginee{

    public void start(){
        System.out.println("Diesel Engine Started.");
    }
}

class Carr{
    private Enginee engine;

    public Carr(Enginee engine){
        this.engine = engine;
    }

    public void startCar() {
        engine.start();;
        System.out.println("Car is ready to go!");
    }
}

public class InterfaceCompositionExample {
    public static void main(String[] args) {
        Carr petrolCar = new Carr(new PetrolEngine());
        petrolCar.startCar();

        Carr dieselCar = new Carr(new DieselEngine());
        dieselCar.startCar();
    }
}













