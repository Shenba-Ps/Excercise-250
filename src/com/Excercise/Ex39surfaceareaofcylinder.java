package com.Excercise;
//Java program to find surface area of cylinder
import java.util.Scanner;

public class Ex39surfaceareaofcylinder {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the radius");
        double r=a.nextDouble();
        System.out.println("enter the height");
        double h=a.nextDouble();
        double  tsa=((2*22*r)/7)*(r+h);
        System.out.println(tsa);
    }
}
