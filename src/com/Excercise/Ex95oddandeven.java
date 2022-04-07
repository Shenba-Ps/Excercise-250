package com.Excercise;
import java.util.Arrays;
//Write a Java program to find the number of even and odd integers in a given array of integers
public class Ex95oddandeven {
    public static void main(String[] args)
        {
            int[] myarray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println("Original Array: "+Arrays.toString(myarray));
            int ctr = 0;
            for(int i = 0; i < myarray.length; i++)
            {
                if(myarray[i] % 2 == 0)
                    ctr++;
            }
            System.out.println("Number of even numbers : "+ctr);
            System.out.println("Number of odd numbers  : "+(myarray.length-ctr));
        }

}
