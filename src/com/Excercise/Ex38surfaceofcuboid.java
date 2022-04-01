package com.Excercise;
//Java program to find surface area of cuboid
import java.util.Scanner;

public class Ex38surfaceofcuboid {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the length");
        double l=scan.nextDouble();
        System.out.println("enter the height");
        double h=scan.nextDouble();
        System.out.println("enter the breadth");
        double b=scan.nextDouble();
        double  area=(2*((l*b)+(b*h)+(h*l)));
        System.out.println(area);
    }
}
