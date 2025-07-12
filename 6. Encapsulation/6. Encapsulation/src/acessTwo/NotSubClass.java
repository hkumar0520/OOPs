package acessTwo;

import access.BaseClass;

public class NotSubClass {
    public static void main(String[] args) {
        BaseClass baseClassTwo = new BaseClass(0, "Default", "Default", 0);

        System.out.println(baseClassTwo.getNumberPrivateMember());
        // noModifierName cannot be accessed in different package subClass, or classes
        System.out.println(baseClassTwo.getNoModifierName());
        //  nameProtectedMember cannot be accessed in different package different class
        System.out.println( baseClassTwo.getNameProtectedMember());
        System.out.println(baseClassTwo.numberPublicMember);
    }
}
