package AwesomeLLD.Aggregation;

import java.util.ArrayList;
import java.util.List;

interface Teachable {
    void teach();
}

class Professorr implements Teachable {
    private String name;
    private String subject;

    public  Professorr(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public void teach(){
        System.out.println(name + " is teaching " + subject);
    }
}

class Universityy{
    private String universityName;
    private List<Teachable> professors;

    public Universityy(String universityName){
        this.universityName = universityName;
        this.professors = new ArrayList<>();
    }

    public void addProfessor(Teachable professor){
        professors.add(professor);
    }

    public void showProfessors(){
        System.out.println("Professors at " + universityName + ":");
        for(Teachable professor : professors){
            professor.teach();
        }
    }

}

public class InterfaceAggregationExample {
    public static void main(String[] args) {
        Professorr prof1 = new Professorr("Dr. Adams", "Physics");
        Professorr prof2 = new Professorr("Dr. Lee", "Chemistry");

        Universityy universityy = new Universityy("MIT");

        universityy.addProfessor(prof1);
        universityy.addProfessor(prof2);

        universityy.showProfessors();
    }
}
