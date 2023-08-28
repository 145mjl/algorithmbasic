package chap02;

import java.util.Scanner;

public class MaxOfArrayRand {

    int maxOf(int[] a){
        int max=0;
        for(int i=0;i<a.length;i++){
            if(max<a[i])
                max=a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("사람 수: ");
        int n=sc.nextInt();
        sc.close();
        int[] height=new int[n];

        for(int i=0;i<n;i++){
            height[i]=(int)(Math.random()*100)+100;
            System.out.println("height["+i+"]: " + height[i]);
        }

        MaxOfArrayRand m=new MaxOfArrayRand();
        System.out.println("최댓값은 "+m.maxOf(height)+"입니다.");
    }
}
