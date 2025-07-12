package extendDemoTwo;

public class Main implements A, B{

    @Override
    public void greet() {

    }

    @Override
    public void fun() {
        A.super.fun();
    }
}
