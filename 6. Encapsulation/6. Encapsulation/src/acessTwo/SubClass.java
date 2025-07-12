package acessTwo;

import access.BaseClass;

public class SubClass extends BaseClass {

    public SubClass(int numberPrivateMember, String noModifierName,
                    String nameProtectedMember, int numberPublicMember)
    {
        super(numberPrivateMember, nameProtectedMember, noModifierName, numberPublicMember);
    }

    public static void main(String[] args) {

        SubClass subClass = new SubClass(0, "Default", "Default", 0);

        // private accessable only in class
        System.out.println(subClass.getNumberPrivateMember());
        // noModifierName cannot be accessed in different package subClass
        System.out.println(subClass.getNoModifierName());
        System.out.println(subClass.nameProtectedMember);
        System.out.println(subClass.numberPublicMember);



        BaseClass baseClassTwo = new SubClass(0, "Default", "Default", 0);

        System.out.println(baseClassTwo.getNumberPrivateMember());
        // noModifierName cannot be accessed in different package subClass
        System.out.println(baseClassTwo.getNoModifierName());
        // explicitly cast baseClassTwo into SubClass
        System.out.println(((SubClass) baseClassTwo).nameProtectedMember);
        System.out.println(baseClassTwo.numberPublicMember);

    }
}

// only one class should be public in one file
// for other class to be public , pls create another file in Java
class SubSubClass extends SubClass{

    public SubSubClass(int numberPrivateMember, String noModifierName,
                    String nameProtectedMember, int numberPublicMember) {
        super(numberPrivateMember, nameProtectedMember, noModifierName, numberPublicMember);
    }

    public static void main(String[] args) {

        SubSubClass subSubClass = new SubSubClass(0, "Default", "Default", 0);

        // private accessable only in class
        System.out.println(subSubClass.getNumberPrivateMember());
        // noModifierName cannot be accessed in different package subClass
        System.out.println(subSubClass.getNoModifierName());
        System.out.println(subSubClass.nameProtectedMember);
        System.out.println(subSubClass.numberPublicMember);



        BaseClass baseClassTwo = new SubSubClass(0, "Default", "Default", 0);

        System.out.println(baseClassTwo.getNumberPrivateMember());
        // noModifierName cannot be accessed in different package subClass
        System.out.println(baseClassTwo.getNoModifierName());
        // explicitly cast baseClassTwo into SubClass
        System.out.println(((SubSubClass) baseClassTwo).nameProtectedMember);
        System.out.println(baseClassTwo.numberPublicMember);
    }
}
