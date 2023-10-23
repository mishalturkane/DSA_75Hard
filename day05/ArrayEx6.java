package day05;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=kb.nextInt();
        int[] arr =new int[n];


        System.out.print("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=kb.nextInt();

        }
        kb.close();
        int [] even=new int[n];
        int [] odd=new int[n];
        int evenNo=0;
        int oddNo=0;
        for(int x:arr){
            if(x%2==0){
                even[evenNo]=x;
                evenNo++;
            }
            else
            {
                odd[oddNo]=x;
                oddNo++;
            }
        }
        System.out.println("The order of output array is:");
       for(int i=0;i<evenNo;i++){
           System.out.print(even[i]+" ");
       }
        for(int i=0;i<oddNo;i++){
            System.out.print(odd[i]+" ");
        }
    }

}
