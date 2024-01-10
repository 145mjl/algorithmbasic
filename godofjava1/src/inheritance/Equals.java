package inheritance;

public class Equals {
    public static void main(String[] args) {
        Equals thisObject = new Equals();
        thisObject.equalMethod();
        thisObject.equalMethod2();
        thisObject.myMethod();
    }

    public void equalMethod(){
        MemberDTO obj1=new MemberDTO("Sangmin");
        MemberDTO obj2=new MemberDTO("Sangmin");

        if(obj1==obj2){
            System.out.println("obj1 and obj2 is same.");
        }else{
            System.out.println("obj1 and obj2 is different.");
        }
    }

    public void equalMethod2(){
        MemberDTO obj1=new MemberDTO("Sangmin");
        MemberDTO obj2=new MemberDTO("Sangmin");

        if(obj1.equals(obj2)){
            System.out.println("obj1 and obj2 is same.");
        }else{
            System.out.println("obj1 and obj2 is different.");
        }

    }

    private void myMethod() {

        MemberDTO temp1=new MemberDTO("Woojae","01012341234");
        MemberDTO temp2=new MemberDTO("Woojae","01012341234");
        MemberDTO temp3=new MemberDTO("Woojae","01012341235");

        if(temp1.equals(temp2)){
            System.out.println("temp1 and temp2 is same.");
            System.out.println("temp1 hashCode() : "+temp1.hashCode());
            System.out.println("temp2 hashCode() : "+temp2.hashCode());
        }else{
            System.out.println("temp1 and temp2 is different");
        }

        if(temp1.equals(temp3)){
            System.out.println("temp1 and temp3 is same");
        }else{
            System.out.println("temp1 and temp3 is different.");
            System.out.println("temp3 hashCode() : "+temp3.hashCode());
        }
    }
}
