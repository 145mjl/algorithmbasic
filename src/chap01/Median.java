package chap01;

import java.util.Scanner;

public class Median {

    public int med3(int a,int b,int c){
        if(a>b){
            if(b>c){
                return b;
            }else if(a>c){
                return c;
            }else{
                return a;
            }
        }else if(b<c){
            return b;
        }else if(a>c){
            return a;
        }else{
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Median median=new Median();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("중앙값은 "+median.med3(a,b,c));
        sc.close();

    }
}
