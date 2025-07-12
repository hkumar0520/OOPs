package BasicInterface.classess;

import BasicInterface.interfaces.Engine;

public class ElecticEngine implements Engine {

    public void start(){
        System.out.println("Electric Engine Car Start ");
    }

    public void stop(){
        System.out.println("Electric Engine Car Stop ");
    }

    public void acc(){
        System.out.println("Electric Engine Car Accelerate ");
    }
}
