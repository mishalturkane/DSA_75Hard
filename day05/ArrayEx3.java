package day05;

import java.util.Scanner;

public class ArrayEx3 {
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

    }
}
