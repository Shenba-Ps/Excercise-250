package com.Excercise;

import java.util.Scanner;
public class Ex23squareroot
{
    public static void main(String[] args)
    {
        //Take input from the user
        //Create an instance of the Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        Double squareroot = Math.pow(num, 0.5);
        System.out.println("The Square Root of the Given Number  " + num + "  =  " + squareroot);

    }
}