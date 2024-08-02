package com.example.java01.java;

public class FastCampusClass {

    public static void main(String[] args) {
        int i = 0;
        int size = 5;

        while(i < size) {
            for(int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
            i++;
        }
    }
}
