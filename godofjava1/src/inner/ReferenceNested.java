package inner;

public class ReferenceNested {
    static class StaticNested{
        private int staticNestedInt=11;
    }
    class Inner{
        private int innerValue=22;
    }
    public void setValue(int value){//감싸고 있는 클래스에서 Static Nested Class 나 Inner Class 의 인스턴스 변수에 접근 가능
        StaticNested nested = new StaticNested();
        nested.staticNestedInt=value;
        Inner inner=new Inner();
        inner.innerValue=value;
    }
}
