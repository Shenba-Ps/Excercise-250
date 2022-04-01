package com.Excercise;
//Java program to find surface area of cube
import java.util.Scanner;

public class Ex40Surfacecube {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the side of the cube");
        double side=a.nextDouble();
        double  r = 4*side*side;
        System.out.println(r);
    }
}
