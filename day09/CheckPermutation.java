package day09;

import java.util.Arrays;

public class CheckPermutation {
    public static boolean isPermutation(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        int arr[]=new int[256];
        char x;
        for(int i=0;i<str1.length();i++){
            x=str1.charAt(i);
            arr[x]++;
            x=str2.charAt(i);
            arr[x]--;
        }
        for(int i=0;i<str1.length();i++){
            if(arr[i]!=0)
                return false;
        }
       return true;
    }
    public static void main(String[] args) {
        System.out.println(isPermutation("liak","kalai"));
    }
}
