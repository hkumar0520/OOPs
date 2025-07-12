package ExampleTwoFromStream;

public class ObjectPrint {

    int num;

    public ObjectPrint(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint " + this.num;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(5);

        // without ovverride "ExampleTwoFromStream.ObjectPrint@7b23ec81"
        System.out.print(obj);


    }
}
