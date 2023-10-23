package day05;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
     char ch;
       do {
           System.out.println("Enter the number:");
           int num=kb.nextInt();
           if(num%2==0){
               System.out.println("Number is even:");
           }else System.out.println("Number id odd");
           System.out.println("Do u  want to countinue (y/n)?");
             ch=kb.next().charAt(0);
       }while(ch=='y');
        System.out.println("thank u");
    }
}
