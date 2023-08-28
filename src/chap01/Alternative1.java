package chap01;

import java.util.Scanner;

public class Alternative1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");
        System.out.print("n값: ");
        n=sc.nextInt();
        sc.close();

        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print("+");
            }else{
                System.out.print("-");
            }
        }

        //Alternative 2 - if-else 판단 반복 줄이기
        for(int i=0;i<n/2;i++){
            System.out.print("+-");
        }
        if(n%2!=0){
            System.out.print("+");
        }
    }
}
