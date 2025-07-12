package Afolder;

import Bfolder.SubGreetings;
import static Bfolder.SubGreetings.saySubGreetingsStatic;

public class Greetings {

    public static void main(String[] args){
        System.out.println(" This is class package AFolder ");

        SubGreetings obj = new SubGreetings();
        obj.saySubGreetings();

        saySubGreetingsStatic();
    }
}
