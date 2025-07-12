package Comparing_two;

public class Student implements Comparable<Student>{

    int rollno;
    float marks;

    public Student(int rollno, float marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }


    @Override
    public int compareTo(Student obj) {
        System.out.println("In compareTo method");
        int diff = (int)(this.marks - obj.marks);

        // if diff == 0: means both are equal
        // if diff < 0: means obj is bigger else obj is smaller

        return diff;
    }
}
