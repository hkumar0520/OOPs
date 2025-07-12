package abstractDemo;

public abstract class Parent {

    final int maxLimit;
    int age;

    public Parent(int age){
        maxLimit = 1;
        this.age = age;
    }
//    public abstract Parent(int age){
//        maxLimit = 1;
//        this.age = age;
//    }

    public final void childrenThree(){
        System.out.println("ChildrenThree of Parent is called");
    }
//    public abstract final void childrenThree(){
//        System.out.println("ChildrenThree of Parent is called");
//    }

    public static void childrenTwo(){
        System.out.println("childrenTwo of Parent is called");
    }
//    public abstract static void childrenTwo(){
//        System.out.println("childrenTwo of Parent is called");
//    }

    public void children(){
        System.out.println("children of Parent is called");
    }

    abstract void career();
}
