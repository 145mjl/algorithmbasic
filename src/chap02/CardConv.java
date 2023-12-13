package chap02;

import java.util.Scanner;

public class CardConv {

    static void reverse(char[] arr){

        for(int i=0;i<arr.length/2;i++){
            char temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }

    }

    static void cardConv(int integer,int radix,char[] arr){
        String digitsChar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int digits=0;

        do{
            arr[digits++]=digitsChar.charAt(integer%radix);
            integer/=radix;
        }while(integer!=0);

        reverse(arr);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,radix=0;
        char[] chars=new char[32];

        System.out.println("음이 아닌 정수를 입력: ");
        do{
            n= sc.nextInt();
        }while(n<0);

        System.out.println("어떤 진수로 변환합니까?(2~36): ");
        do{
            radix=sc.nextInt();
        }while(radix<2||radix>36);

        sc.close();

        cardConv(n,radix,chars);

        System.out.print(radix+"진수로 ");
        for (int i=0;i<chars.length;i++){
            System.out.print(chars[i]);
        }
        System.out.println("입니다.");

    }
}
