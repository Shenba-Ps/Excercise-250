package com.Excercise;
import java.util.Scanner;
//Java Program to find volume of sphere

public class Ex34volumeofsphere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the radius of sphere");
        double r = scan.nextDouble();
        double volume=(4*22*r*r*r)/(3*7);
        System.out.println(volume);
    }
}
