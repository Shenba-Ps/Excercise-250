package com.Excercise;
import java.util.*;
//Write a Java program to find second largest number from the array

public class Ex93secondlargestnumber {

        public static void main(String[] args) {
            int[] myarray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println("Original numeric array : "+Arrays.toString(myarray));
            Arrays.sort(myarray);
            int index = myarray.length-1;
            while(myarray[index]==myarray[myarray.length-1]){
                index--;
            }
            System.out.println("Second largest element of the array: " + myarray[index]);
        }
    }

