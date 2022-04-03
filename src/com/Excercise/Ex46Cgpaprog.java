package com.Excercise;

public class Ex46Cgpaprog {

        public static void main(String arg[]) {
            int num = 5;

            double mm[] = new double[num];

            double gg[] = new double[num];

            double cgpa, sum = 0;

            mm[0] = 95;

            mm[1] = 85;

            mm[2] = 75;

            mm[3] = 80;

            mm[4] = 95;

            for (int i = 0; i < num; i++) {
                gg[i] = (mm[i] / 10);
            }

            for (int i = 0; i < num; i++) {
                sum += gg[i];
            }

            cgpa = sum / num;

            System.out.println("CGPA = " + cgpa);

            System.out.println("percantage from CGPA = " + cgpa * 9.5);

        }
    }

