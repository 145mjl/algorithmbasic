package annotation;

import inheritance.Parent;

public class AnnotationOverride extends Parent {
    @Override
    public void printName(){
        System.out.println("Annotation Override");
    }
}
