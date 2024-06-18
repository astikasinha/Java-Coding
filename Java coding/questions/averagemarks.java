package questions;
//package oct26array;

import java.util.*;

public class averagemarks {
    public static void main(String[] args) {
        int i, sum = 0, avg;
        int[] marks;// declaration of array ,marks as a reference
        marks = new int[30];// assigning memory space to marks
        Scanner scn = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            marks[i] = scn.nextInt();
        }
        for (i = 0; i < 3; i++) {
            sum = sum + marks[i];
        }
        avg = sum / 3;
        System.out.println(avg);
    }
}
