package com.Excercise;
import java.util.Arrays;
//Write a Java program to insert an element (specific position) into an array

public class Ex87insertelement {
    public static void main(String[] args) {

            int[] myarray = {1,2,3,4,6,7,8,9,10};

            int Index_position = 4;
            int newValue    = 5;

            System.out.println("Original Array : "+Arrays.toString(myarray));

            for(int i=myarray.length-1; i > Index_position; i--){
                myarray[i] = myarray[i-1];
            }
            myarray[Index_position] = newValue;
            System.out.println("New Array: "+Arrays.toString(myarray));

        }
    }

