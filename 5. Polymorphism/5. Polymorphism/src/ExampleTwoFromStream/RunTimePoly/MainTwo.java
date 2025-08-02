package ExampleTwoFromStream.RunTimePoly;

public class MainTwo {
    // for method overriding, everything shouldsame,
    // method return type, method name, method parameters list declaration
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();
        Shapes triangle = new Triangle();

        shape.area();
        circle.area();
        square.area();
        triangle.area();
        System.out.println(shape.areaTwo(1));
        System.out.println(circle.areaTwo(3.0));
        System.out.println(square.areaTwo(3.0));
        System.out.println(triangle.areaTwo(3.0));
    }
}
