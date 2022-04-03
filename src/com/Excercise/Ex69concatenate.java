package com.Excercise;
//Write a Java program to concatenate two string
public class Ex69concatenate {


        public static void main(String[] args)
        {
            String str1 = "shenba";
            String str2 = "rajan";

            System.out.println("String 1: " + str1);
            System.out.println("String 2: " + str2);


            // Concatenating the two strings together.
            String str3 = str1.concat(str2);

            System.out.println("The concatenated string: " + str3);
        }

}
