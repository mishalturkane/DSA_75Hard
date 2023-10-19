package day01;

public class SecondLarge {
    public  static int secLarge(int []arr){
        int max,secMax;
        max=secMax=Integer.MIN_VALUE;

        for(int x:arr){
            if(x>max){
                secMax=max;
                max=x;
            }
            else {
                if(x> secMax && x!=max){
                    secMax=x;
                }
            }
        }
        return secMax;
    }

    public static void main(String[] args) {
        int [] arr={1,3,4,4};
        System.out.println(secLarge(arr));
    }
}
