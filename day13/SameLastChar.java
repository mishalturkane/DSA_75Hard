package day13;

public class SameLastChar {
    public   static     boolean sameLactChar(String str){
       int length=str.length();
       if(str.charAt(0)==str.charAt(length-2) && str.charAt(1)==str.charAt(length-1) )
           return true;
       return false;
    }
    public static void main(String[] args) {
        System.out.println( sameLactChar("educated"));
    }
}
