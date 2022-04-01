package com.Excercise;
import java.util.Scanner;
//Java Program to find Volume of cylinder

public class Ex35volumeofcylinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the radius");
        double r=scan.nextDouble();
        System.out.println("enter the height");
        double h=scan.nextDouble();
        double  volume=((22*r*r*h)/7);
        System.out.println(volume);
    }
}
