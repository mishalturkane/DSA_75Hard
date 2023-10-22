package dya04;


import java.util.Arrays;

public class FindDuplicatetwice {
    public static void findDupli(int []arr){
        int [] arr2;
        Arrays.sort(arr);
        int i;
        for( i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={4,3,2,7,5,2,3,1,0};
        findDupli(arr);
    }
}
