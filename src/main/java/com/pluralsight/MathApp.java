package com.pluralsight;

public class MathApp {
    public static void main (String [] args) {
        main(String[] args) {
            int bobSalary = 60000;
            int garySalary = 70000;

           int highestSalary = Math.max(bobSalary, garySalary);

            System.out.println("The highest salary is: " + highestSalary);

            double carPrice, truckPrice;

            carPrice = 35000;
            truckPrice = 50000;

            System.out.println("Minimum car price: " + Math.min(carPrice, truckPrice));

        }
    }