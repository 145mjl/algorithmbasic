package exception;

public class ThrowableSample {
    public static void main(String[] args){
        ThrowableSample sample = new ThrowableSample();
        sample.throwable();
    }
    
    public void throwable(){
        int[] intArray=new int[5];
        try{
            intArray=null;
            System.out.println(intArray[5]);
        }catch(Throwable t){
            System.out.println("**** t.getMessage() - 예외 메세지를 String 형태로 반환 ****");
            System.out.println(t.getMessage());
            System.out.println("**** t.toString() - 예외 메세지, 예외 클래스를 String 형태로 반환 ****");
            System.out.println(t.toString());
            System.out.println("**** t.printStackTrace() - 예외 메세지, 예외가 발생하게 된 메소드들의 호출 관계(stacktrace) 출력 ****");
            t.printStackTrace();
        }
    }
}
