//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import packages.staticVariables.*;

public class Main {
    public static void main(String[] args) {

        //    static variables
        System.out.println("################# Static Variables first time called ########################");
        System.out.println("Print Count : " + StaticVariableExamples.getCountObjects());
        StaticVariableExamples obj1 = new StaticVariableExamples();
        System.out.println("Print Count : " + StaticVariableExamples.getCountObjects());
        StaticVariableExamples obj2 = new StaticVariableExamples();
        System.out.println("Print Count : " + StaticVariableExamples.getCountObjects());
        StaticVariableExamples obj3 = new StaticVariableExamples();
        System.out.println("Print Count : " + StaticVariableExamples.getCountObjects());

        //    Main mainObj = new Main();
        //    mainObj.Greeting();


        System.out.println("################# Static Blocks first time called ########################");
        // static blocks
        System.out.println("Count of static blocks : " + StaticBlocks.getInstancesCount());

    }

    void Greeting(){
        System.out.println("Greetings ");
    }
}



