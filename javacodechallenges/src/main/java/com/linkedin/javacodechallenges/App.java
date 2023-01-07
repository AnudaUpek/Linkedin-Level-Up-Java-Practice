package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean number = false;

        if(password.length()>5){
            for(int i =0; i < password.length(); i++){
                char ch = password.charAt(i);
                if(Character.isUpperCase(ch)){
                    upperCase = true;
                }
                if (Character.isLowerCase(ch) ) {
                    lowerCase = true;
                }
                if (Character.isDigit(ch) ) {
                    number = true;
                }
            }
            if(upperCase == true && lowerCase == true ){
                if(number == true){
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
            
        } else {
            return false;
        }
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
