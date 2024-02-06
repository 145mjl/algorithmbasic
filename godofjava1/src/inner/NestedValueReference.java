package inner;

public class NestedValueReference {
    public int publicInt;
    protected int protectedInt=1;
    int justInt=2;
    private int privateInt=3;
    static int staticInt=4;
    static class StaticNested{//StaticNested 클래스는 자신을 감싸는 클래스의 static 변수만을 참조할 수 있다.
        public void setValue(){
            staticInt=24;
        }
    }
    class Inner{//Inner Class는 자신을 감싸는 클래스의 모든 변수를 참조할 수 있다.
        public void setValue(){
            publicInt=32;
            protectedInt=34;
            justInt=45;
            privateInt=43;
            staticInt=21;
        }
    }

    public void setValue(){
        EventListener listener=new EventListener() {//익명 클래스 역시 자신을 감싸는 클래스의 어떤 변수라도 참조할 수 있다.
            @Override
            public void onClick() {

                publicInt=1;
                protectedInt=2;
                justInt=3;
                privateInt=4;
                staticInt=5;
            }
        };
    }
}
