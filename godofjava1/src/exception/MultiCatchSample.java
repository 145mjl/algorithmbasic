package exception;

public class MultiCatchSample {
    public static void main(String[] args) {
        MultiCatchSample multiCatchSample = new MultiCatchSample();
        multiCatchSample.multiCatch();
        multiCatchSample.multiCatchOrderChange();
        multiCatchSample.multiCatchThree();
        multiCatchSample.multiCatchThreeWithNull();
        multiCatchSample.multiCatchThreeWithNull2();
        multiCatchSample.multiNoCatch();
    }

    public void multiCatch(){
        int[] intArray=new int[5];
        try{
            System.out.println(intArray[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred.");
        }catch(Exception e){
            System.out.println(intArray.length);
        }finally{
            System.out.println("Here is finally");
        }
    }

    public void multiCatchOrderChange(){
        int[] intArray=new int[5];
        try{
            System.out.println(intArray[5]);
        }catch(Exception e){
            System.out.println(intArray.length);
        }/*catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        }*/
    }

    public void multiCatchThree(){
        int[] intArray=new int[5];
        try{
            System.out.println(intArray[5]);
        }catch(NullPointerException e){
            System.out.println("NullPointerException occurred.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        }catch(Exception e){
            System.out.println(intArray.length);
        }
    }

    public void multiCatchThreeWithNull(){
        int[] intArray=new int[5];
        try{
            intArray=null;
            System.out.println(intArray[5]);
        }catch(NullPointerException e){
            System.out.println("NullPointerException occurred.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBouondsException occurred.");
        }catch(Exception e){
            System.out.println(intArray);
        }
    }

    public void multiCatchThreeWithNull2() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBouondsException occurred.");
        } catch (Exception e) {
            System.out.println(intArray);
            System.out.println("Exception occurred.");
        }
    }

    public void multiNoCatch(){
        int[] intArray=new int[5];
        try{
            intArray=null;
            System.out.println(intArray[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred.");
        }
    }
}
