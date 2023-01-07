package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        // TODO: Implement method
        
        if(gallonsUsage < 1497){
            return 18.84;
        } else {
            double ccfs = Math.ceil((gallonsUsage - 1496) / 748);            
            double bill = 18.84 + (ccfs * 3.90);           
            return bill;
        }
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
