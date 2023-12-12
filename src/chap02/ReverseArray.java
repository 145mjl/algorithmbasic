package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    static void reverse(int[] arr) {
        for(int i=0;i<arr.length/2;i++){
            swap(arr,i,arr.length-i-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("배열 길이(요솟수) : ");
        int num=sc.nextInt();
        int[] arr=new int[num];

        for (int i=0;i<num;i++){
            System.out.print("["+i+"] : ");
            arr[i]=sc.nextInt();
        }

        reverse(arr);

        System.out.println("요소를 역순으로 정렬했습니다.");
        System.out.println(Arrays.toString(arr));

    }


}
