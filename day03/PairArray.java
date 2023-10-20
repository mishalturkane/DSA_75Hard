package day03;

public class PairArray {
    public static void pair(int [] arr){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                ++count;
            }
            System.out.println();
        }
        System.out.println("total pair in array are="+count);
    }
    public static void main(String[] args) {
        int [] arr={2,4,6,8,10};
        pair(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
