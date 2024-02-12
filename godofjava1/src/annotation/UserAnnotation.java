package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)//어노테이션 적용 대상 - 메소드 선언시 . (= 이 어노테이션은 메소드에 사용할 수 있다.)
@Retention(RetentionPolicy.RUNTIME)//실행시 어노테이션 정보가 가상 머신에 의해 참조 가능
public @interface UserAnnotation {//어노테이션 이름 앞에 @interface를 선언하였다. @UserAnnotation 으로 어노테이션 사용 가능.

    //어노테이션을 사용할 때 () 안에서 메소드 이름의 엘리먼트에 메소드 리턴타입에 맞는 값을 지정한다
    //예시 - @UserAnnotation(number=1,text="first")
    public int number();

    public String text() default "This is first annotation";//default 예약어로 기본값을 지정할 수 있다. 별도로 값을 지정해 주지 않아도 컴파일에 문제 없음.
}
