package packages.staticVariables;

public class InnerClasses {

    static class Test{
        int a;
        int b;
        static int c;

        Test(){
            this.a = 0;
            this.b = 0;
            Test.c = 0;
        }

        static {
            System.out.println("Test class is loaded , value of c : " + Test.c);
        }
    }

    public static void main(String[] args) {
        Test a = new Test();


    }
}
