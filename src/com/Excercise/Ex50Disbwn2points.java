package com.Excercise;
import java.lang.Math.*;
//Java Pogram To Find Distance Between Two Points
public class Ex50Disbwn2points {


        public static void main(String arg[])
        {
            int x1,x2,y1,y2;
            double dis;
            x1=2;y1=2;x2=6;y2=6;
            dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
            System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
        }
    }

