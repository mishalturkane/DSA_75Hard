package day03;

public class SubArray {
    public static void printSubarr(int [] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                ++count;
            }
        }
        System.out.println("total subarrays are="+count);
    }
    public static void printMaxSubarrSum(int [] arr){
        int count=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                System.out.println(sum);
                if(max<sum){
                    max=sum;
                }
                if(min>sum){
                    min=sum;
                }
            }
        }
        System.out.println("Max sub array sum is="+max);
        System.out.println("Min  sub array sum is="+min);
    }
    public static void main(String[] args) {
        int [] arr={1,-2,6,-1,3};
        printMaxSubarrSum(arr);
    }
}
