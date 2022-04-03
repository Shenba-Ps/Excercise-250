package com.Excercise;
import java.util.*;
//student grade

public class Ex67grade {

        public static void main(String[] args)
        {
            showGrade();
        }

        static void showGrade(){

            float quiz_score, mid_score,final_score,avg;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter you quiz score:");
            quiz_score=sc.nextFloat();
            System.out.print("Enter your Mid-term score:");
            mid_score=sc.nextFloat();
            System.out.print("Enter your Final score:");
            final_score=sc.nextFloat();
            avg=(quiz_score+mid_score+final_score)/3;

            if(avg>=90) System.out.println("Your grade A.");
            else if((avg>=70) && (avg<90)) System.out.println("Your grade B.");
            else if((avg>=50) && (avg<70)) System.out.println("Your grade C.");
            else if(avg<50) System.out.println("Your grade F.");
            else System.out.println("Invalid");


        }


}
