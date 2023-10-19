package day01;

public class ReverseArr {
    public static void reverseArray(int [] arr){
        int first=0;
        int last=arr.length-1;
        while (first < last) {
            int temp = arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            ++first;
            --last;
        }
    }

    public static void main(String[] args) {
        int [] arr={12,13,14,15,16,17,18,19};
        reverseArray(arr);
        System.out.println("Revrse array is=");
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
}
