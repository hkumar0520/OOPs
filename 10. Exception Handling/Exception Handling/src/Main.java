

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        try {
//            int ans = divide(5, 0);

            //  mimicing
            String name = "Kunal";
            if( name.equals("Kunal")) {
                throw new MyException("name is Kunal");
            }
        } catch( MyException e){
            System.out.println(e.getMessage());
        } catch( ArithmeticException e){
             System.out.println(e.getMessage());
        } catch( Exception e){
             System.out.println("Exception " + e.getMessage());
        } finally {
            System.out.println("this will always execute");
        }
    }

//    static int divide(int a, int b) throws Exception // also used
    static int divide(int a, int b) throws ArithmeticException{
        if( b == 0){
            throw new ArithmeticException("please do not divide by zero");
        }
        return  a / b;
    }
}