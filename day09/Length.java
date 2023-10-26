package day09;

import java.util.Scanner;

public class Length {
    public  static  int getLength(String str){

       int count=0;
       while(true){
           try{
               str.charAt(count);
               count++;
           }catch(StringIndexOutOfBoundsException ex){
               break;
           }
       }
       return count;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter the String=");;
        String str=kb.next();
        System.out.println(getLength(str));
    }
}
