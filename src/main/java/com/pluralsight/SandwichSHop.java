package com.pluralsight;

import java.util.Scanner;

public class SandwichSHop {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What size sandwich would you like?:");
        System.out.println("1: Regular: $5.45");
        System.out.println("2: Large: $8.95");

        int sandwichSize = myScanner.nextInt();



    }
}
