package extendDemoTwo;

public interface B {

    void greet();

    default void fun(){
        System.out.println("default method in B");
    }
}
