package com.Excercise;
import java.util.*;

public class Ex19secondsconverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the seconds");
        int seconds = scan.nextInt();
        int p1=seconds%60;
        int p2=seconds/60;
        int p3=p2%60;
        p2=p2/60;
        System.out.println("HH:MM:SS-"+p2+":"+p3+":"+p1);


    }
}
