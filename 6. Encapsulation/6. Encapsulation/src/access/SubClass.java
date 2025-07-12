package access;

public class SubClass extends BaseClass{

    public SubClass(int numberPrivateMember, String noModifierName,
                    String nameProtectedMember, int numberPublicMember)
    {
        super(numberPrivateMember, nameProtectedMember, noModifierName, numberPublicMember);
    }

    public static void main(String[] args) {

        SubClass subClass = new SubClass(0, "Default", "Default", 0);
        // private accessable only in class
        System.out.println(subClass.getNumberPrivateMember());
        System.out.println(subClass.noModifierName);
        System.out.println(subClass.nameProtectedMember);
        System.out.println(subClass.numberPublicMember);

        System.out.println("########### Base class reference ###################");

        BaseClass baseClassTwo = new SubClass(0, "Default", "Default", 0);
        System.out.println(baseClassTwo.getNumberPrivateMember());
        System.out.println(baseClassTwo.noModifierName);
        System.out.println(baseClassTwo.nameProtectedMember);
        System.out.println(baseClassTwo.numberPublicMember);

    }
}
