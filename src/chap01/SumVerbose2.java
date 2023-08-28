package chap01;

import java.util.Scanner;

public class SumVerbose2 {
    public static void main(String[] args) {//매 반복마다 if-else를 거치지 않게 한다.
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            System.out.print(i+" + ");
        }

        sum+=n;
        System.out.print(n+" = ");
        System.out.println(sum);

    }
}
