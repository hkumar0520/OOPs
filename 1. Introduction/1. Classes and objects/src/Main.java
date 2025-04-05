//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        Student first = new Student();
        Student second = new Student(14, "second", 4.5f);
        // creating new object with details of second object
        Student third = new Student(second);

        first.print();
        second.print();
        third.print();

        second.changeName("Kumar");
        second.print();
        third.print();

        Student sameSecond = second;
        sameSecond.changeName("sameSecond");

        second.print();
        sameSecond.print();
        third.print();

        System.out.println(Arrays.toString(students));


//        garbage collector
        A obj = new A("tmp");
        for(int i =0; i<1e7; i++){
            obj = new A("");
        }
    }
}

class A{
    String name;
    public A(String namestr){
        this.name = namestr;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("object is destroyed");
    }
}

class Student {
    int rno;
    String name;
    float marks = 90;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student  ( Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }


    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    void print(){
        System.out.println("Roll No : " + this.rno + " , Name : " + this.name + " , Marks : " + this.marks);
    }



}


