package inner.practice;

public class MyPage {

    InputBox input;

    public static void main(String[] args){
        MyPage practice = new MyPage();
        practice.setUI();
        practice.pressKey();
    }

    public void setUI(){
        input = new InputBox();
        KeyEventListener listener=new KeyEventListener(){
          @Override
          public void onKeyDown(){
              System.out.println("Key Down");
          }

          @Override
          public void onKeyUp(){
              System.out.println("Key Up");
          }
        };

        input.setKeyListener(listener);
    }

    public void pressKey(){
        input.listenerCalled(2);
        input.listenerCalled(4);
    }
}
