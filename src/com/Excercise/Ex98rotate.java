package com.Excercise;
import java.util.Arrays;
import java.util.*;
//Write a Java program to cyclically rotate a given array clockwise by one
public class Ex98rotate {

        static int arra[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        static void rotate_array()
        {
            int num = arra[arra.length-1], i;
            for (i = arra.length-1; i > 0; i--)
                arra[i] = arra[i-1];
            arra[0] = num;
        }

        public static void main(String[] args)
        {
            System.out.println("Original arraay:");
            System.out.println(Arrays.toString(arra));

            rotate_array();

            System.out.println("Rotated arraay:");
            System.out.println(Arrays.toString(arra));
        }
    }

