package day02;

public class SortZeroOne {
    public static void sortZeroOne(int [] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] == 1) {
                if (arr[end] != 1) {
                    arr[start] = arr[end];
                    arr[end] = 1;
                }
                end--;
                } else
                start++;
        }
    }
    public static void main(String[] args) {
        int [] arr={0,1,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,0,0,1,1,0,1,0,1,0,1,0,1,0,1};
        sortZeroOne(arr);
        System.out.println("After sorting the array");
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
