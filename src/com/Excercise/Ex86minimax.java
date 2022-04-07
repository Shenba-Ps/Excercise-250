package com.Excercise;
import java.util.Arrays;
public class Ex86minimax {



        static int max;
        static int min;

        public static void max_min(int myarray[]) {
            max = myarray[0];
            min = myarray[0];
            int len = myarray.length;
            for (int i = 1; i < len - 1; i = i + 2) {
                if (i + 1 > len) {
                    if (myarray[i] > max) max = myarray[i];
                    if (myarray[i] < min) min = myarray[i];
                }
                if (myarray[i] > myarray[i + 1]) {
                    if (myarray[i] > max) max = myarray[i];
                    if (myarray[i + 1] < min) min = myarray[i + 1];
                }
                if (myarray[i] < myarray[i + 1]) {
                    if (myarray[i] < min) min = myarray[i];
                    if (myarray[i + 1] > max) max = myarray[i + 1];
                }
            }
        }

        public static void main(String[] args) {
            int[] myarray = {1,2,3,4,5,6,7,8,9,10};
            max_min(myarray);
            System.out.println(" Original Array: "+Arrays.toString(myarray));
            System.out.println(" Maximum value for the above array = " + max);
            System.out.println(" Minimum value for the above array = " + min);
        }
    }

