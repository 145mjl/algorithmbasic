package inheritance;

public class InheritanceOverriding {
    public static void main(String[] args) {
        ChildOverriding child=new ChildOverriding();
        child.printName();
        ChildOverridingPrivate childOverridingPrivate = new ChildOverridingPrivate();
        childOverridingPrivate.printName();
    }
}
