package com.Excercise;
import java.util.Arrays;
//Write a Java program to get the difference between the largest and smallest values in an array of integers
public class Ex96difflargestandsmallest {
    public static void main(String[] args)
        {
            int[] myarray = {10,20,30,40,50,60,70,80,90};
            System.out.println("Original Array: "+Arrays.toString(myarray));
            int maxval = myarray[0];
            int min = myarray[0];
            for(int i = 1; i < myarray.length; i++)
            {
                if(myarray[i] > maxval)
                    maxval = myarray[i];
                else if(myarray[i] < min)
                    min = myarray[i];
            }
            System.out.println("Difference between the largest and smallest araay element is: "+(maxval - min));
        }
    }
