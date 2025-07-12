package Comparing_two;


import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student kunal = new Student(12, 89.76f);
        Student rahul = new Student(5, 99.76f);
        Student arpit = new Student(2, 79.76f);
        Student karan = new Student(13, 69.76f);
        Student sachin = new Student(9, 94.76f);

        Student[] list = { kunal, rahul, arpit, karan, sachin};

        System.out.println("Normal : " + Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("CompareTo : " + Arrays.toString(list));

        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(int)(o1.marks - o2.marks);
            }
        });

        System.out.println("Decreasing : " + Arrays.toString(list));

        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));

        System.out.println("Increasing : " + Arrays.toString(list));


        if(kunal.compareTo(rahul) < 0)
            System.out.println("Kunal has more marks");
        else
            System.out.println("rahul has more marks");

    }
}
