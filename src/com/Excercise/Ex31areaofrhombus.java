package com.Excercise;
import java.util.Scanner;
//Java Program to find area of rhombus

public class Ex31areaofrhombus {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the diagonal 1");
        double d1=scan.nextDouble();
        System.out.println("enter the diagonal 2");
        double d2=scan.nextDouble();
        double area=d1*d2/2;
        System.out.println(area);
    }
}
