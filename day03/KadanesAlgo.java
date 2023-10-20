package day03;

import java.net.Inet4Address;

import static day03.KadanesAlgo.Solution.kadanes;

public class KadanesAlgo {
    class Solution {
        public static int kadanes(int[] nums) {
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;

            for (int i = 0; i < nums.length; i++) {
                currentSum += nums[i];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }

                if (currentSum < 0) {
                    currentSum = 0;
                }
            }

            return maxSum;
        }
    }
    public static boolean checkNegative(int [] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                count=-1;
            }
            else{
                count=1;
            }
        }
        if(count==-1 && count!=1){
          return true;
        }else {
           return false;
        }
    }
    public static void main(String[] args) {
        int [] arr={-2,-3,-3,-2,-9,-5};
        int max=kadanes(arr);
        System.out.println(max);
    }
}
