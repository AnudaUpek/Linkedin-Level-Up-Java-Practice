package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        // TODO: Implement method
        int cc = 0;
        if(gallonsUsage < 1497){
            return 18.84;
        } else {
            int ccfs = (int) (gallonsUsage -1496)/748;
            // System.out.println(ccfs);
            cc = Math.round(ccfs);
            if((gallonsUsage-1496)%748 != 0){
                cc += 1;
            }
            //System.out.println(cc);
            double bill = 18.84 + (cc * 3.90);
            //System.out.println(cc);
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
