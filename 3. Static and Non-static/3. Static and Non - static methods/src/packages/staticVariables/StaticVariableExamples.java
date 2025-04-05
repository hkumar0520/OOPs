package packages.staticVariables;

public class StaticVariableExamples {
    int simpleVar;
    static int countObjects;

    public StaticVariableExamples(){
        this.simpleVar = 0;
        StaticVariableExamples.countObjects++;
    }

    public static int getCountObjects(){
        return StaticVariableExamples.countObjects;
    }

}
