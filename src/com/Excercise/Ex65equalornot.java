package com.Excercise;
import java.util.Scanner;
//Write a Java program that accepts three numbers and check All numbers are equal or not

public class Ex65equalornot {
    public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int num1 = in.nextInt();
            System.out.print("Enter second number: ");
            int num2 = in.nextInt();
            System.out.print("Enter third number: ");
            int num3 = in.nextInt();

            if (num1 == num2 && num1 == num3)
            {
                System.out.println("All numbers are equal");
            }
            else if ((num1 == num2) || (num1 == num3) || (num3 == num2))
            {
                System.out.println("Neither all are equal or different");
            }
            else
            {
                System.out.println("All numbers are different");
            }
        }

}
