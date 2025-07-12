package access;

public class Main {
    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass(0, "Default", "Default", 0);

        // private accessable only in class
        System.out.println(baseClass.getNumberPrivateMember());
        System.out.println(baseClass.noModifierName);
        System.out.println(baseClass.nameProtectedMember);
        System.out.println(baseClass.numberPublicMember);

    }
}
