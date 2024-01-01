package chap22_24.map.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {

    private final int DATA_BOUNDARY;
    private final Hashtable<Integer,Integer> hashtable;

    public RandomNumberStatistics(){
        DATA_BOUNDARY=50;
        hashtable = new Hashtable<>();
    }

    public void getRandomNumberStatistics(){
        Random random=new Random();
        for(int i=0;i<5000;i++){
            putCurrentNumber(random.nextInt(DATA_BOUNDARY)+1);
        }
        printStatistics();
    }

    public void putCurrentNumber(int tempNumber) {
        if(hashtable.containsKey(tempNumber)){
            hashtable.put(tempNumber,hashtable.get(tempNumber)+1);
        }else{
            hashtable.put(tempNumber,1);
        }
    }

    public void printStatistics(){
        Set<Integer> keySet=hashtable.keySet();
        for(Integer key:keySet){
            System.out.print(key+"="+hashtable.get(key)+" ");
            if(key%10==1) System.out.println();
        }
    }

    public static void main(String[] args){
        RandomNumberStatistics randomNumberStatistics = new RandomNumberStatistics();
        randomNumberStatistics.getRandomNumberStatistics();
    }
}
