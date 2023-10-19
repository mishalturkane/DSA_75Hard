package day01;

public class PrintMax {
    public static void printSum(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
       for(int x:arr){
            if(max<x){
                max=x;
            }
            if(min>x){
                min=x;
            }
        }
        System.out.println("Max="+max+"\n"+"Min="+min);
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,6,78,7,0,88};
        printSum(arr);
         }
}
