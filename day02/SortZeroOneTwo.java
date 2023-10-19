package day02;

public class SortZeroOneTwo {
    public static void sort(int [] arr){
        int left=0;
        int right=arr.length-1;
        int current=0;
        int temp;
        while(current<=right){
           if(arr[current]==0){
               temp=arr[left];
               arr[left]=arr[current];
               arr[current]=temp;
               left++;
               current++;
           }
           else if(arr[current]==2){
               temp=arr[current];
               arr[current]=arr[right];
               arr[right]=temp;
               right--;
           }
           else
               current++;
        }
    }
    public static void sort2(int []arr){
        int temp;
        int left=0;
        int right=arr.length-1;
        int current=0;
        while(current<=right){
            if(arr[current]==0){
                temp=arr[current];
                arr[current]=arr[left];
                arr[left]=temp;
                left++;
            }
            else if(arr[current]==2){
               temp=arr[current];
               arr[current]=arr[right];
               arr[right]=temp;
                right--;
            }
            else
                current++;
        }
    }
    public static void main(String[] args) {
        int [] arr={2,1,2,0,1,2,1,0,0,1,0,2,0,1};
        sort2(arr);
        System.out.println("After sorting the array are=");
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
