import abstractDemo.Daughter;
import abstractDemo.Parent;
import abstractDemo.Son;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

//        There can be no objects of an abstract class.
//        Parent obj = new Parent();

        Son son = new Son(5);
        son.career();
        son.children();
        Son.childrenTwo();

        System.out.println("####################### Daughter references #####################");

        Daughter daughter = new Daughter(10);
        daughter.career();

        Parent.childrenTwo();

        System.out.println("####################### other references #####################");

        Parent sonReference = new Son(20);
        Parent daughterReference = new Daughter(30);

        sonReference.children();
        Parent.childrenTwo();
    }
}