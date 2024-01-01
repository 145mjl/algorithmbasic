package chap22_24.map.hashmap;

import java.util.*;

public class MapSample {
    public static void main(String[] args){
        MapSample mapSample = new MapSample();
        mapSample.checkHashMap();
        mapSample.checkKeySet();
        mapSample.checkValues();
        mapSample.checkEntrySet();
        mapSample.checkContains();
        mapSample.checkRemove();
    }

    private void checkRemove() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A","a");
        map.remove("A");
        System.out.println(map.size());
    }

    private void checkContains() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A","a");
        map.put("B","b");
        map.put("C","c");
        map.put("D","d");

        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("Z"));
        System.out.println(map.containsValue("a"));
        System.out.println(map.containsValue("z"));
    }

    private void checkEntrySet() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A","a");
        map.put("B","b");
        map.put("C","c");
        map.put("D","d");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for(Map.Entry<String,String> entry:entrySet){
            System.out.println("entry : "+entry);
            System.out.println("entry.getKey() : "+entry.getKey());
            System.out.println("entry.getValue() : "+entry.getValue());
        }
    }

    private void checkValues() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A","a");
        map.put("C","c");
        map.put("D","d");
        Collection<String> values =map.values();
        for(String s:values){
            System.out.println("값 : "+s);
        }
    }

    private void checkKeySet() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A","a");
        map.put("C","c");
        map.put("D","d");
        Set<String> keySet= map.keySet();
        for(String s:keySet){
            System.out.println("키 : "+s+" - 값 : "+map.get(s));
        }
    }

    private void checkHashMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "a");
        //키와 값은 각각 무엇일까?
        //키 "A" 값 "a"
        System.out.println(hashMap.get("A"));
        System.out.println(hashMap.get("B"));
        hashMap.put("A", "1");
        System.out.println(hashMap.get("A"));

    }
}
