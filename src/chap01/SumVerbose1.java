package chap01;

import java.util.Scanner;

public class SumVerbose1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            if(i==n){
                System.out.println(i+" = "+sum);
            }else{
                System.out.print(i+" + ");
            }
        }
    }
}
