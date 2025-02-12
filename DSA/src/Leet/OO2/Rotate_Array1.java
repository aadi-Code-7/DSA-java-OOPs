package Leet.OO2;

import java.util.Arrays;

public class Rotate_Array1 {
    public static void main(String[] args) {
        int[] arr = {-1};
        int k=2;
        rotate(arr,k);
    }
    static void rotate(int[] nums, int k){
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

        System.out.println(Arrays.toString(nums));
    }
    static void reverse(int[] nums,int s,int e){
        while (s<e){
            int temp = nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}
