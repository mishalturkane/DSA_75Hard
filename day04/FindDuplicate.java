package dya04;

import java.util.Arrays;

public class FindDuplicate {
    public static void findDupli(int [] arr){
        int i=0;
        for(i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]==arr[j]){
                    break;
                }
            }
        }
        System.out.println("Duplicate element is="+arr[i]);
    }
    public  static void findDupli2(int [] arr){
        Arrays.sort(arr);
        int i;
        for( i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("DUplicate element is="+arr[i]);
                break;}
        }

    }
    public static void main(String[] args) {
        int [] arr={1,0,2,0};
        findDupli2(arr);
    }

}
