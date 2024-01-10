package util;

public class FinalVariable {
    final int instanceVariable=1;
    //Variable 'instanceVariable' might not have been initialized
    public void method(final int param){
        final int localVariable;
        localVariable=2;
//        localVariable=3;//Variable 'localVariable' might already have been assigned to
//        param=4;//Cannot assign a value to final variable 'param'
    }
}
