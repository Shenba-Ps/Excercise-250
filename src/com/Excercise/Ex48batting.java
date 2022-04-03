package com.Excercise;

public class Ex48batting {

        public static void main(String arg[]) {
            int Totakmatches = 100, totalruns = 3500, Innings = 80, notout = 1;

            double avg;

            avg = totalruns / (Innings - notout);

            System.out.println("batting average=" + avg);

        }
    }

