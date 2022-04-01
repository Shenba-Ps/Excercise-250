package com.Excercise;
//Java Program to find Volume Of cuboid
import java.util.Scanner;

public class Ex36volumeofcuboid {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the length");
        double l=scan.nextDouble();
        System.out.println("enter the height");
        double h=scan.nextDouble();
        System.out.println("enter the breadth");
        double b=scan.nextDouble();
        double volume=l*b*h;
        System.out.println(volume);
    }
}
