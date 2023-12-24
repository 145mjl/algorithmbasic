package chap22_24.collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class SetSample {
    public static void main(String[] args){
        SetSample setSample = new SetSample();
        String[] cars = new String[]{
                "Tico","Sonata","BMW","Benz",
                "Lexus","Mustang","Grandeure",
                "The Beetle","Mini Cooper","130",
                "BMW","Lexus","Carnibal","SM5",
                "SM7","SM3","Tico"
        };

        System.out.println(setSample.getCarKinds(cars));

    }

    private int getCarKinds(String[] cars) {
        if(cars==null) return 0;

        HashSet<String> hashSet=new HashSet<>(cars.length);
        for(String car:cars){
            hashSet.add(car);
        }

        printCarSet(hashSet);
        printCarSet2(hashSet);

        return hashSet.size();
    }

    private void printCarSet2(HashSet<String> hashSet) {
        Iterator<String> iterator=hashSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }

    private void printCarSet(HashSet<String> hashSet) {
        for (String s : hashSet) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
