
import Afolder.Greetings;
import Bfolder.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Greetings.Main();

        Bfolder.Greetings.Main();

        // non static member called using object
        Bfolder.Greetings obj = new Bfolder.Greetings();
        obj.message();
    }
}