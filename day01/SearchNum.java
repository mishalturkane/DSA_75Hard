package day01;

public class SearchNum {
   public static void searchNum(int [] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                System.out.println("Numebr is present="+arr[i]);
                return;
            }
        }

    }

    public static void main(String[] args) {
        int [] arr={12,2,445,5,678,23,2,2,3,45,45,5};
        int num=12;
        searchNum(arr,num);
    }
}
