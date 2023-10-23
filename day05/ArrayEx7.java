package day05;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the base Number:");
        double base=kb.nextInt();
        System.out.println("Enter thre power:");
        double power=kb.nextInt();
       double result=1;
        for(int i=0;i<power;i++){
            result=base*result;
        }
        System.out.println("Result="+result);
    }
}
