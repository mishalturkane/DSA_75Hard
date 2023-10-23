package day05;

import java.util.Scanner;

public class ArrayEx10 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the positive number:");
        int n=kb.nextInt();
        int i;
        for( i=2;i<=n-1;i++){
            if(n%i==0){
                break;
            }
        }
        if(i==n){
            System.out.println("Number is prime");
        }else System.out.println("number is not  prime");
    }
}
