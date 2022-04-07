package com.Excercise;
import java.util.Arrays;
//Write a Java program to reverse an array of integer values

public class Ex88reversearray {
    public static void main(String[] args){
            int[] myarray = {1,2,3,4,5,6,7,8,9,10};
            System.out.println("Original array : "+Arrays.toString(myarray));
            for(int i = 0; i < myarray.length / 2; i++)
            {
                int temp = myarray[i];
                myarray[i] = myarray[myarray.length - i - 1];
                myarray[myarray.length - i - 1] = temp;
            }
            System.out.println("Reverse array : "+Arrays.toString(myarray));
    }

}
