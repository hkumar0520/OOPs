package ShallowCopyUsingClone;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 9, 1};
    }

    @Override
    public Human clone() throws CloneNotSupportedException{
        return (Human) super.clone();
    }
}











