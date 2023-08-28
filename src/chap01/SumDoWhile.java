package chap01;

import java.util.Scanner;

public class SumDoWhile {//SumFor2 변형
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다.");
        int n=0;
        do{
            System.out.print("n값: ");
            n=sc.nextInt();
        }while(n<=0);
        sc.close();

        int sum=0;
        int i=1;
        do{
            sum+=i;
        }while(i++<n);

        System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
    }
}
