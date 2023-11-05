package day19;

import java.util.Scanner;

public class StringLength {
    public static int chekLength(String str){
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
        String str=kb.nextLine();
       System.out.println(chekLength(str));
    }
}
