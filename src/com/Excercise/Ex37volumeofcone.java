package com.Excercise;
//find the volume of cone
import  java.util.Scanner;

public class Ex37volumeofcone {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the radius");
        double r=scan.nextDouble();
        System.out.println("enter the height");
        double h=scan.nextDouble();
        double  volume=(22*r*r*h)/(3*7);
        System.out.println(volume);
    }
}
