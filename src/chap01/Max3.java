package chap01;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최대값을 구합니다.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int max=a;
        if(max<b){
            max=b;
        }
        if(max<c){
            max=c;
        }

        System.out.println("max = " + max);
    }
}
