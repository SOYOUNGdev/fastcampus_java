package com.example.java01.java;

public class StarTask02 {
    public static void main(String[] args) {
        int size = 5;
        int floor = 1;

        for(int i = floor; i <= size; i++) {
            // space, 회색박스
            for(int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }

            // star, 별
            for(int j = 0; j < 2 * i - 1;  j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
