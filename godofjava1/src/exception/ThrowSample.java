package exception;

public class ThrowSample {
    public static void main(String[] args){
        ThrowSample sample = new ThrowSample();
        sample.throwException(13);
        try{
            sample.throwsException(13);
        }catch(Exception e){
            System.out.println("호출한 메소드(main)로 예외가 전달(throws)되어, try-catch로 감싸 처리함");
        }
    }

    private void throwException(int i) {
        try{
            if(i>12){
                throw new Exception("Number is over than 12");//param - String message
            }
            System.out.println("Number is "+i);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void throwsException(int i) throws Exception{
        if(i>12){
            throw new Exception("Number is over than 12");
        }
        System.out.println("Number is "+i);
    }
}
