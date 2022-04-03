package com.Excercise;

import java.util.Scanner;
//Write a java program to check vowel or consonant

public class Ex59vowels {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the char");
            char Ch= scan.next().charAt(0);

            if (Ch =='a' || Ch == 'e' || Ch =='i' || Ch =='o' || Ch =='u'||Ch =='A' || Ch == 'E' || Ch =='I' || Ch =='O' || Ch =='U'){
                System.out.println("vowel");}
            else {
                System.out.println("not vowel");
            }

        }
    }

