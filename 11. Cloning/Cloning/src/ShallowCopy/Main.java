package ShallowCopy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Human kunal = new Human(34, "Kunal");

        // twin is just a reference point to kunal's object in heap  memory
        Human twin = kunal;
        twin.age = 45;
        twin.name = "Harish";
        twin.arr[0] = 100;

        // primitive are also changes, as well inner objects
        System.out.println(kunal.age + " " + kunal.name + " " + Arrays.toString(kunal.arr));
        System.out.println(twin.age + " " + twin.name + " " + Arrays.toString(kunal.arr));
    }
}
