package packages.staticVariables;

public class StaticVariableExamples {
    int simpleVar;
    static int countObjects;

    public StaticVariableExamples(){
        this.simpleVar = 0;
        StaticVariableExamples.countObjects++;
    }

    public static int getCountObjects(){
        // Non-Static field cannot be referenced from static context
//        simpleVar++;
//        this.simpleVar++;
        // Non-Static method cannot be referenced from static context
//        noStaticMethod();
        onStaticMethod();

        return StaticVariableExamples.countObjects;
    }

    public void noStaticMethod(){
        System.out.println("Non - Static Method");
    }

    public static void onStaticMethod(){
        System.out.println("On Static Method");
    }

}
