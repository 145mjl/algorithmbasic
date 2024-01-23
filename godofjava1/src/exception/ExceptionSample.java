package exception;

public class ExceptionSample {
    public static void main(String[] args){
        ExceptionSample exceptionSample = new ExceptionSample();
        exceptionSample.arrayOutOfBounds();//컴파일 시에는 체크하지 않고 예외를 발생시킴
    }

    public void arrayOutOfBounds(){
        int[] intArray=new int[5];
        System.out.println(intArray[5]);
    }
}
