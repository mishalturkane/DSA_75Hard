package day02;

public class PairSum {
    public static int pairSum(int [] arr,int target){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(target==arr[i]+arr[j]){
                    ++count;
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
        return count;
    }
    public static int pairSum2(int [] arr,int target){
        int cout=0;
        int start=0;
        int end=arr.length-1;
        System.out.println("pairs are:");
        while(start<end){
            int sum=arr[start]+arr[end];
            if(target==sum){
                ++cout;
                System.out.print("("+arr[start]+","+arr[end]+")");
                System.out.println();
                start++;
                end--;

            }
            else if(sum>target){
                end--;
            }
            else{
                start++;
            }

        }
        return cout;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8};
        int target=6;
        int pairs=pairSum2(arr,target);
        System.out.println("Posible pair sum of the array is="+pairs);
    }
}
