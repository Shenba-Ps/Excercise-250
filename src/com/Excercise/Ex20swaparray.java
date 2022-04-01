package com.Excercise;
import java.util.Arrays;

public class Ex20swaparray {
    public static void main(String[] args)
        {
            int[] array_nums = {44,20, 30, 40};
            System.out.println("Original Array: "+Arrays.toString(array_nums));
            int x = array_nums[0];
            array_nums[0] = array_nums[array_nums.length-1];
            array_nums[array_nums.length-1] = x;
            System.out.println(Arrays.toString(array_nums));
        }
    }


