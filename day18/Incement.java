package day18;

import java.util.Arrays;

public class Incement {

    public static void main(String[] args) {
      Object num[]=new Object[10];
       Arrays.fill(num,new Object(){

           int count=0;
           @Override
           public String toString(){
               return Integer.toString(++count);
           }
       });
        System.out.println(Arrays.toString(num));
    }

}
