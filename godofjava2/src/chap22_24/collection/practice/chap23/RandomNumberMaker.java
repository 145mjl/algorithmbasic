package chap22_24.collection.practice.chap23;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    public static void main(String[] args) {
        RandomNumberMaker randomNumberMaker = new RandomNumberMaker();
        for(int i=0;i<10;i++){
            System.out.println(randomNumberMaker.getSixNumber());
        }

    }

    public HashSet<Integer> getSixNumber() {
        HashSet<Integer> hashSet = new HashSet<>(1);

        while(hashSet.size()<6){
            Random random = new Random();
            int temp=random.nextInt(45);
            hashSet.add(temp);
        }

        return hashSet;
    }
}
