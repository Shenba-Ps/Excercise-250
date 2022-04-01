package com.Excercise;
import java.util.Arrays;

public class Ex22array {
    public static void main(String[] args) {
        int[] nums={2,4,3,5,7,55,34,36,22,23,44,43,25};
        int odd=0; int even=0;
        System.out.println("Original Array: "+Arrays.toString(nums));
        for (int i = 0; i<nums.length;i++){
            if (nums[i] % 2==0)
                even++;
            else
                odd++;

        }
        System.out.println(odd);
        System.out.println(even);
    }
}
