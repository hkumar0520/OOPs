package Bfolder;

public class Greetings {

    public static void main(String[] args){
        System.out.println("This is package BFolder");
    }

    public void message(){

        System.out.println("This is the message from Bfolder package");

//        no need of import in case of same folder
        SubGreetings obj = new SubGreetings();
        obj.saySubGreetings();
    }
}
