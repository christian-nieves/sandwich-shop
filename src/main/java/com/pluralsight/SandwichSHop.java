package com.pluralsight;

import java.util.Scanner;

public class SandwichSHop {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What size sandwich would you like?:");
        System.out.println("1: Regular: $5.45");
        System.out.println("2: Large: $8.95");

        int sandwichSize = myScanner.nextInt();

        double basePrice = 0;

        if (sandwichSize == 1) {
            basePrice = 5.45;
        } else if (sandwichSize == 2){
            basePrice = 8.95;
        } else {
            System.out.println("Not an option");
        }

        System.out.println("Enter your age: ");
        int age = myScanner.nextInt();

        double totalCost = basePrice;

        if (age <= 17) {
            totalCost = basePrice - (basePrice * 0.10);
        } else if (age >= 65) {
            totalCost = basePrice - (basePrice * 0.20);
        } else  {

        }

        System.out.printf("Your total cost is: $%.2f", totalCost);

        myScanner.close();

        }
    }









