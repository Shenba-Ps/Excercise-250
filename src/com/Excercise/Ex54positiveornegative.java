package com.Excercise;
import java.util.Scanner;
//Write a Java program to test a number is positive or negative
public class Ex54positiveornegative {

    public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input number: ");
            int num = in.nextInt();

            if (num > 0)
            {
                System.out.println("Number is positive");
            }
            else if (num < 0)
            {
                System.out.println("Number is negative");
            }
            else
            {
                System.out.println("Number is zero");
            }
        }
    }

