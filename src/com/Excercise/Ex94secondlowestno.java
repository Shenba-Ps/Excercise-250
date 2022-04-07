package com.Excercise;
//Write a Java program to find second lowest number from the array
import java.util.Arrays;
public class Ex94secondlowestno {
    public static void main(String[] args) {

            int[] myarray = {-1, 1, 2, 3, 5, 10};
            System.out.println("Original numeric array : "+Arrays.toString(myarray));
            int min = Integer.MAX_VALUE;
            int secondmin = Integer.MAX_VALUE;
            for (int i = 0; i < myarray.length; i++) {
                if(myarray[i]==min){
                    secondmin=min;
                } else if (myarray[i] < min) {
                    secondmin = min;
                    min = myarray[i];
                } else if (myarray[i] < secondmin) {
                    secondmin = myarray[i];
                }

            }
            System.out.println("Second lowest number is : " + secondmin);
        }

}
