package packages.staticVariables;

public class StaticBlocks {

    static int instancesCount;
    int tempVar;
    static {
        //  this statement is called first
        instancesCount = 0;
        System.out.println("Instances initialize : " + instancesCount);
    }

    public static int getInstancesCount(){
        return instancesCount;
    }

    public void printVar() {
        System.out.println("Varialbles count : " +  tempVar);
    }

    public static void main(String[] args) {
        StaticBlocks obj = new StaticBlocks();

    }
}
