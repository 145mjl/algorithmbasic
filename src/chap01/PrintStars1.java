package chap01;

import java.util.Scanner;

public class PrintStars1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,w;
        System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");
        do{
            System.out.print("n값:");
            n=sc.nextInt();
        }while(n<=0);

        do{
            System.out.print("w값: ");
            w=sc.nextInt();
        }while(w<=0||w>n);

        sc.close();
//        for(int i=1;i<=n;i++){
//            System.out.print("*");
//            if(i%w==0){
//                System.out.println("");
//            }
//        }

        //더 효율적인 코드가 있는지 고민해보기
//        int quotient,remainder;
//        quotient=n/w;
//        remainder=n%w;
//        for(int i=0;i<quotient;i++){
//            for(int j=0;j<w;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//        for(int i=0;i<remainder;i++){
//            System.out.print("*");
//        }

        //교재 풀이
        for(int i=0;i<n/w;i++){
            System.out.println("*".repeat(w));
        }
        if(n%w!=0)//체크해주는 이유 - sout("*".repeat(0));은 sout("");과 같다. 즉 개행된다.
            System.out.println("*".repeat(n%w));

    }
}
