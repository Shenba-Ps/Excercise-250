package com.Excercise;
//Write a Java program to convert all characters in a string to uppercase
public class Ex71uppercase {


        public static void main(String[] args)
        {
            String str = "techstudy - The Complete Debugging Solution";

            // Convert the above string to all uppercase.
            String upper_str = str.toUpperCase();

            // Display the two strings for comparison.
            System.out.println("Original String: " + str);
            System.out.println("String in uppercase: " + upper_str);
        }
    }

