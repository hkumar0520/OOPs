package access;

public class BaseClass {
    private int numberPrivateMember;
    String noModifierName;
    protected String nameProtectedMember;
    public int numberPublicMember;

    public BaseClass(int numberPrivateMember, String noModifierName,
                     String nameProtectedMember, int numberPublicMember) {
        this.numberPrivateMember = numberPrivateMember;
        this.noModifierName = noModifierName;
        this.nameProtectedMember = nameProtectedMember;
        this.numberPublicMember = numberPublicMember;
    }

    public int getNumberPrivateMember() {
        return numberPrivateMember;
    }

    public String getNoModifierName() {
        return noModifierName;
    }

    public String getNameProtectedMember() {
        return nameProtectedMember;
    }

    public int getNumberPublicMember() {
        return numberPublicMember;
    }

    public void setNumberPrivateMember(int numberPrivateMember) {
        this.numberPrivateMember = numberPrivateMember;
    }

    public void setNoModifierName(String noModifierName) {
        this.noModifierName = noModifierName;
    }

    public void setNameProtectedMember(String nameProtectedMember) {
        this.nameProtectedMember = nameProtectedMember;
    }

    public void setNumberPublicMember(int numberPublicMember) {
        this.numberPublicMember = numberPublicMember;
    }
}
