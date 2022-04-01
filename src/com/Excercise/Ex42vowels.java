package com.Excercise;
//Java program to check vowel or consonant
import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Ex42vowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the char");
        char Ch= scan.next().charAt(0);
        ;
        if (Ch =='a' || Ch == 'e' || Ch =='i' || Ch =='o' || Ch =='u'){
        System.out.println("vowel");}
        else {
            System.out.println("not vowel");
        }

    }
}
