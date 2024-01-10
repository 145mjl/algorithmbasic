package enums;

public class OverTimeManager3 {
    public static void main(String[] args) {
        OverTimeValues2[] valueArr=OverTimeValues2.values();//static method
        for(OverTimeValues2 value:valueArr){
            System.out.println(value+":"+value.getAmount());
        }
    }
}
