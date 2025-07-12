package myExample;

public class Main {

    public static void main(String[] args) {

        try{
            divide(5, 100000 + 1);
        } catch(CustomException e){
            System.out.println(e.getMessage());
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        } catch( Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("This block is run everytime ");
        }
    }

    static void divide(int a, int b) throws Exception{
        if(b == 0)
            throw new ArithmeticException("denominator is zero");
        else if( b >= 1e5)
            throw new CustomException("denominator is very large number");

        System.out.println("The result is : " + a/b);
    }
}
