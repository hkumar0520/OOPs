package abstractDemo;

public class Son extends Parent{

    public Son(int age ){
        super(age);
    }
//    cannot be overridden final
//    public void childrenThree(){
//
//    }

    // static methods of abstract claas not override
//    @Override
    public static void childrenTwo(){
        System.out.println("ChildrenTwo of Son called");
    }

    // normal
    @Override
    public void children(){
        System.out.println("children of Son is called");
        System.out.println("Age of Son is : " + age);
    }

    // abstract
    @Override
    public void career() {
        System.out.println("career of Son is called");
    }

}
