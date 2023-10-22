package dya04;

public class SearchIntertPosition {
    public static int solve(int [] arr,int target){
        int i;
        for( i=0;i<arr.length-1;i++){
            if(target==0){
                return 0;
            }
             else if(arr[i]==target){
               return i;
            }
            else if(arr[i]+1==target){
                return i+1;
            }
            else{
                return i+1;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int [] arr={1,3,5,6};
        int index=solve(arr,7);
        System.out.println(index);
    }
}
