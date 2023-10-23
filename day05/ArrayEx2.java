package day05;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=kb.nextInt();
        int[] arr =new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.print("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=kb.nextInt();

        }
        for(int x:arr){
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
        }
        System.out.println("The maximum value of the given array is="+max);
        System.out.println("The minimum value of the given array is="+min);
    }
}
