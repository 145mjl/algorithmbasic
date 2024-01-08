package inheritance;

public class ChildOverridingPrivate extends ParentOverridingPrivate{

    public ChildOverridingPrivate(){
        System.out.println("ChildOverridingPrivate.ChildOverridingPrivate");
    }

    public void printName(){
        System.out.println("ChildOverridingPrivate - PrintName()");
    }
}
