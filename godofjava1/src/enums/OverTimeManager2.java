package enums;

public class OverTimeManager2 {
    public static void main(String[] args) {
        OverTimeValues2 value2=OverTimeValues2.FIVE_HOUR;
        System.out.println(value2);
        System.out.println(value2.getAmount());

        OverTimeValues2 value3= OverTimeValues2.WEEKEND_FOUR_HOUR;

        System.out.println(value2.compareTo(value3));
//        System.out.println(value2.ordinal());
//        System.out.println(value2.name());
//        System.out.println(value2.getClass());
//        System.out.println(value2.getDeclaringClass());
//        System.out.println(value2.hashCode());

    }
}
