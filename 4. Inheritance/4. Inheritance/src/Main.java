import Box.Box;
import BoxWeight.BoxWeight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Box boxObj = new Box(5);
        System.out.println("################## Box Object #################### ");
        boxObj.getConfigurations();
        boxObj.greeting();

        BoxWeight boxWeight = new BoxWeight(1,5);
        System.out.println("################## BoxWeight Object #################### ");
        boxWeight.getAllConfigurations();
        boxWeight.greeting();

        Box referenceVarParent = new BoxWeight(5,3,5,10);
        System.out.println("######Reference Variable Parent, BoxWeight Object #################### ");
        referenceVarParent.getConfigurations();
        // calling of child class greeting from parent reference , object of child class
        referenceVarParent.greeting();
        referenceVarParent.greetingWithAncestor();
        System.out.println(referenceVarParent);

        // cannot access objects of child class and methods as well
//        referenceVarParent.getWeight();


        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
//        BoxWeight referenceVarObj = new Box(4);
    }
}