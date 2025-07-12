package BasicInterface;

import BasicInterface.classess.Car;
import BasicInterface.classess.NiceCar;
import BasicInterface.interfaces.Engine;
import BasicInterface.interfaces.Media;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Engine car = new Car();

        car.start();
        car.stop();
        car.acc();

        System.out.println("################## New Car Media is there ###########################");

        Media newCarMedia = new Car();
        newCarMedia.start();
        newCarMedia.stop();

        System.out.println("################### Nice Car is there ################################");

        NiceCar niceCar = new NiceCar();

        niceCar.start();
        niceCar.startMusic();
        niceCar.upgradeEngine();
        niceCar.start();



    }
}