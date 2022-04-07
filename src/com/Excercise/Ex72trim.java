package com.Excercise;
//Write a Java program to trim a string(remove whitespaces
public class Ex72trim {

    public static void main(String[] args)
        {
            String str = " TECHSTUDY ";

            // Trim the whitespace from the front and back of the String.
            String new_str = str.trim();

            // Display the strings for comparison.
            System.out.println("Original String: " + str);
            System.out.println("New String: " + new_str);
        }
    }

