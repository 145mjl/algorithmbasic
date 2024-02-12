package annotation;

import java.lang.reflect.Method;

public class UserAnnotationCheck {//어노테이션에 선언한 값을 확인하는 법 - Reflection API 를 이용한다
    public static void main(String[] args) {
        UserAnnotationCheck sample = new UserAnnotationCheck();
        sample.checkAnnotations(UserAnnotationSample.class);
    }

    public void checkAnnotations(Class<UserAnnotationSample> useClass){
        Method[] methods = useClass.getDeclaredMethods();
        for(Method temp:methods){
            UserAnnotation annotation = temp.getAnnotation(UserAnnotation.class);
            if(annotation!=null){
                int number= annotation.number();
                String text= annotation.text();
                System.out.println(temp.getName()+"() : number="+number+",text="+text);
            }else{
                System.out.println(temp.getName()+"() : annotation is null");
            }
        }
    }
}
