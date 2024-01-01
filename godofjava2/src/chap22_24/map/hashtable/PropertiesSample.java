package chap22_24.map.hashtable;

import java.util.Properties;
import java.util.Set;

public class PropertiesSample {
    public static void main(String[] args) {
        PropertiesSample sample = new PropertiesSample();
        sample.checkProperties();
    }

    private void checkProperties() {
        Properties prop = System.getProperties();//System 클래스에 static으로 선언된 메소드
        Set<Object> keySet= prop.keySet();
        for (Object key:keySet){
            System.out.println(key+" = "+prop.get(key));
        }
    }
}
