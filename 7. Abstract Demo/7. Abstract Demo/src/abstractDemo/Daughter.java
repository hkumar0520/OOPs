package abstractDemo;

public class Daughter extends Parent {

    public Daughter(int age ){
        super(age);
    }

    @Override
    public void career() {
        System.out.println("career of Daughter is called");
    }
}
