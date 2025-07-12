package packages.staticVariables;

public class InnerClasses {
    private int varA;
    private static int varB = -1;

    static class Test{
        int a;
        int b;
        static int c;

        Test(){
            this.a = 10;
            this.b = 10;
            Test.c = 10;
            InnerClasses.varB += 10;
            System.out.println("In Test constructor : a " + this.a + " b : " + this.b + " c : "
                    + Test.c + " d : " + InnerClasses.varB );
        }

        static {
            System.out.println("Test class is loaded , value of varB : " + InnerClasses.varB);
            InnerClasses.varB = 0;
            System.out.println("Test class is loaded , value of c : " + Test.c);
            System.out.println("Test class is loaded , value of varB : " + InnerClasses.varB);
        }

    }

    class Normall{
        private int a;
        private int b;

        Normall(){
            a = 0;
            b = 0;
            varB = -2;
            varA = -3;

        }

        {
            System.out.println("VarB value : " + varB);
            System.out.println("VarA value : " + varA);
            System.out.println("Hello Normall class block");
        }
    }

    public static void main(String[] args) {


        InnerClasses.Test a = new InnerClasses.Test();

        InnerClasses newObj = new InnerClasses();

        InnerClasses.Normall newNormalObj = newObj.new Normall();

    }
}
