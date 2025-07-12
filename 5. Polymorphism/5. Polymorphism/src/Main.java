import Animal.Animal;
import Dog.Dog;
import Cat.Cat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Dog dog = new Dog(6, 80, "Black", "Kangal", 4);
        Cat cat = new Cat(8, 280, "Golden", "Lion", 4);

        dog.makeSound();
        cat.makeSound();

        // upCasting
        Animal referenceDog = new Dog(dog);
        Animal referenceCat = new Cat(cat);

        referenceDog.makeSound();
        referenceCat.makeSound();

        referenceDog.makeRun();
        // AnimalmakeRun() run calls as no makeRun() method in Cat class
        referenceCat.makeRun();

        // DownCasting
        Dog newDog = (Dog)referenceDog;
        newDog.makeRun();

        //  DownCasting
        Cat newCat = (Cat)referenceCat;
        // Animal run calls as no makeRun() method in Cat class
        newCat.makeRun();

        // run time exception, not compile time
//        Cat newCatDog = (Cat)referenceDog;
//        newCatDog.makeRun();


    }
}