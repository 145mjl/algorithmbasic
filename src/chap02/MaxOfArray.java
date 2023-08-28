package chap02;

import java.util.Scanner;

public class MaxOfArray {

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
        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수: ");
        int n=sc.nextInt();

        int[] height = new int[n];
        for(int i=0;i<height.length;i++){
            System.out.print("height["+i+"]: ");
            height[i]=sc.nextInt();
        }
        sc.close();

        MaxOfArray m=new MaxOfArray();
        System.out.println("최댓값은 "+m.maxOf(height)+"입니다.");

    }
}
