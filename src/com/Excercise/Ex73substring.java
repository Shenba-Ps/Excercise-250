package com.Excercise;
//Write a Java program to get a substring of a given string between two specified positions
public class Ex73substring {
    public static void main(String[] args)
        {
            String str;
            str = "TECHSTUDY - The Complete Debugging Solution";

            // Get a substring of the above string starting from
            // index 10 and ending at index 26.
            String newstr = str.substring(12, 43);

            // Display the two strings for comparison.
            System.out.println("Old String = " + str);
            System.out.println("New String = " + newstr);

    }
}
