package com.Excercise;
import java.util.Scanner;
//Java Program to find area of parallelogram

public class Ex32parallelogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the height");
        double h=scan.nextDouble();
        System.out.println("enter the breadth");
        double b=scan.nextDouble();
        double area=(h*b);
        System.out.println(area);

    }
}
