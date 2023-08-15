package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your buying price per share:");
        double buyingPrice = scan.nextDouble();
        int day = 1;
        double closingPrice;
        while (true) {
            System.out.println("Enter the closing price for day " + day + " (enter any negative value to leave):");
            closingPrice = scan.nextDouble();
            if (closingPrice < 0.0) {
                break;
            }
            double earnings = closingPrice - buyingPrice;
            if (earnings > 0) {
                System.out.println("After day " + day + ", you earned " + earnings + " per share.");
            } else if (earnings < 0.0) {
                System.out.println("After day " + day + ", you lost " + (-earnings) + " per share.");
            } else {
                System.out.println("After day " + day + ", you have no earnings per share.");
            }
            day += 1;
        }
        scan.close();
    }
}
