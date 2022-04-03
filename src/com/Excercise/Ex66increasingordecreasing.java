package com.Excercise;
import java.util.Scanner;
//Write a java program that accepts three numbers from the user and check if numbers are in “increasing” or “decreasing” order.

public class Ex66increasingordecreasing {


        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input first number: ");
            double num1 = in.nextDouble();
            System.out.print("Input second number: ");
            double num2 = in.nextDouble();
            System.out.print("Input third number: ");
            double num3 = in.nextDouble();
            if (num1 < num2 && num2 < num3)
            {
                System.out.println("Numbers are in Increasing order");
            }
            else if (num1 > num2 && num2 > num3)
            {
                System.out.println("Numbers are in Decreasing order");
            }
            else
            {
                System.out.println("Neither increasing or decreasing order");
            }
        }

}
