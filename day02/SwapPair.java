package day02;

public class SwapPair {
    public  static   void swapPair(int [] arr){
        for(int i=0;i<arr.length-1;i=i+2){
            int temp=0;
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr={9,3,6,12,4,32};
        swapPair(arr);
        System.out.println("After swwaping all pairs");
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

}
