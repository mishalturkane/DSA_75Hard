package day09;

import java.util.Scanner;

public class ReverseString {
    public static StringBuffer getReverseString(String str){
        StringBuffer sb=new StringBuffer();
        for(int i=str.length()-1;i>=0;i--){
         sb.append(str.charAt(i));
        }
        return sb;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter the String=");;
        String str=kb.next();
        System.out.println(getReverseString(str));
    }
}
