package ExampleTwoFromStream.RunTimePoly;

public class MainTwo {

    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();
        Shapes triangle = new Triangle();

        shape.area();
        circle.area();
        square.area();
        triangle.area();
    }
}
