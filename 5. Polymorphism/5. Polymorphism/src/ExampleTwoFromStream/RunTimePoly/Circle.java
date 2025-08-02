package ExampleTwoFromStream.RunTimePoly;

public class Circle extends Shapes {

    void area(){
        System.out.println("area of cirle is pie*raidus*raius");
    }

    double areaTwo(double side){
        return  3.14*side*side;
    }

    // method overloading
//    double areaTwo(int side){
//        return  3.14*side*side;
//    }

//    int areaTwo(double side){
//        return  3.14*side*side;
//    }

//    double areaTwo(double side){
//        return  3.14*side*side;
//    }
}
