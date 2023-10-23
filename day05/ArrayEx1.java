package day05;

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=kb.nextInt();
        int[] arr =new int[n];
        int sum=0;
        System.out.print("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=kb.nextInt();
            sum+=arr[i];
        }
        System.out.print(" the sum of the given array is:"+sum);

    }
}
