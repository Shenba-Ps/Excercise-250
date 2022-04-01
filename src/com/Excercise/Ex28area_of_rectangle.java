package com.Excercise;
import java.util.Scanner;
//Java Program to find area of rectangle

public class Ex28area_of_rectangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the length");
        double l=scan.nextDouble();
        System.out.println("enter the breadth");
        double b=scan.nextDouble();
        double area=l*b;
        System.out.println(area);

    }
}
