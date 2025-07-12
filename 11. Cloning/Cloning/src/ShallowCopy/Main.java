package ShallowCopy;

public class Main {

    public static void main(String[] args) {
        Human kunal = new Human(34, "Kunal");

        Human twin = kunal;
        twin.age = 45;
        twin.name = "Harish";
        // primitive are also changes, as well inner objects
        System.out.println(kunal.age + " " + kunal.name);
        System.out.println(twin.age + " " + twin.name);
    }
}
