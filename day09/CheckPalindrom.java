package day09;

import java.util.Scanner;

public class CheckPalindrom {
    public static  boolean ChekPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<=end){
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            }else break;
        }
        if(start<end)
            return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println(ChekPalindrome("naman"));
        System.out.println(ChekPalindrome("abba"));
        System.out.println(ChekPalindrome("gagan"));
    }
}
