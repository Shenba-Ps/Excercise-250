package com.Excercise;
import java.util.*;
import java.lang.*;
//Write a Java program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s
public class Ex97segregate {

    public static void main(String[] args) {
        int nums[] = {1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0};
        int nums_size = nums.length;
        int left = 0, right = nums_size - 1;

        System.out.println("Original Array : " + Arrays.toString(nums));

        while (left < right) {

            while (nums[left] == 0 && left < right)
                left++;

            while (nums[right] == 1 && left < right)
                right--;


            if (left < right) {
                nums[left] = 0;
                nums[right] = 1;
                left++;
                right--;
            }
        }

        System.out.println("Array after segregation is : " + Arrays.toString(nums));
    }
}

