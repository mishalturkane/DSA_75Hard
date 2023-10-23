package day05;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=kb.nextInt();
        int[] arr =new int[n];

        System.out.print("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=kb.nextInt();

        }
        System.out.print("The next number of given array is:");
        for (int x:arr){
            System.out.print(x+1+" ");
        }

    }
}
