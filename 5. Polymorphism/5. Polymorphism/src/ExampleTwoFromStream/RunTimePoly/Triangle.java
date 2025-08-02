package ExampleTwoFromStream.RunTimePoly;

public class Triangle extends Shapes {

    void area(){
        System.out.println("area of triangle is 0.5*base*height");
    }

    double areaTwo(double side){
        return  (side*side)/2.0;
    }
}
