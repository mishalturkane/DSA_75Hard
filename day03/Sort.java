package day03;

public class Sort {
    public static  void sort(int [] arr){
        int temp;
        int left=0;
        int right=arr.length-1;
        int current=0;
        while(current<=right){
            if(arr[current]==5){
                temp=arr[current];
                arr[current]=arr[left];
                arr[left]=temp;
                left++;
                current++;
            }else if(arr[current]==7){
                temp=arr[current];
                arr[current]=arr[right];
                arr[right]=temp;
                right--;
            }
            else current++;
        }
    }
    public static void main(String[] args) {
        int [] arr={5,6,7,5,6,7,6,5,6,7,6,5};
        sort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
