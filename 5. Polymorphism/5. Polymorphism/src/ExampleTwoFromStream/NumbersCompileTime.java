package ExampleTwoFromStream;

public class NumbersCompileTime {

    double sum(double a , int b){
        return a + b;
    }

    double sum(int a , double b){
        return a + b;
    }

    double sum(int a, int b){
        return a + b;
    }

    // method overloading, parameters list or type should  be different
//    int sum(int a, int b){
//        return a + b;
//    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        NumbersCompileTime obj =  new NumbersCompileTime();
        System.out.println(obj.sum(2.5, 2));
        System.out.println(obj.sum(3, 2));
        System.out.println(obj.sum(3, 2, 5));
    }
}
