package ShallowCopyUsingClone;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(34, "Kunal");
        Human twin = (Human)kunal.clone();

        twin.age = 45;
        twin.name = "harish";
        // primitve are changeable, inner objects are not changeable in shallow copy
        twin.arr[0] = 1;
        System.out.println(kunal.age + " " + kunal.name + " " + kunal.arr[0]);
        System.out.println(twin.age + " " + twin.name + " " + twin.arr[0]);


    }

}
