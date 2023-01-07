package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {

  public void playGame() {
    // TODO: Implement method
    int points = 10;
    System.out.println("Want to Start?");
    Scanner input = new Scanner(System.in);
    boolean isPlaying = input.nextLine().equalsIgnoreCase("yes"); 
    while(isPlaying == true){
      Random rd = new Random();
      boolean i = rd.nextBoolean();
      
      if (i == true) {
        points *= 2;
      } else {
        points *= 0;
      }
      if(points == 0){
        System.out.println("You Lose.");
      } else {
        System.out.println("You have " + points + "Points.");
      }    
      
      System.out.println("Want to Paly Again?");      
      isPlaying = input.nextLine().equalsIgnoreCase("yes");
      if(points == 0 && isPlaying == true){
        points = 10;
        System.out.println("You got 10 points Again");
      }  
    } 
    if (points == 0){
      System.out.println("Better Luck Next Time!");
    } else {
      System.out.println("Congratulations! You got " + points + "Points.");
    }
    

    }
         

}
