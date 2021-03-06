package com.javaLessons.headFirstJava.chapterFive.seaFight10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMain {
    private int[] sheepLoc = new int[3];
    private int numOfHits = 0;
    private int numOfTries = 0;
    private boolean isAlive = true;

    public void gameStart() {
        System.out.println("\"Sheep fight\"");
        System.out.println("Game start");
        int nose = (int) (Math.random() * 4);
        sheepLoc = setSheep(nose);
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        while (isAlive) {
            System.out.println("Please choose the cell");
            try {
                guess = sc.nextInt();
                Integer guess2 = guess;
                String guessString = guess2.toString();
                String result = checkIfShot(guessString);
                System.out.println(result);
                if (guess == 10) {
                    System.out.println("Game finished");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Not a digit, please input relevant value");
                sc.next();
            }
        }
        if (guess != 10) {
            System.out.println("You won");
            System.out.println("You've used " + numOfTries + " attempts");
            System.out.println("Game over");
        }
    }

    private String checkIfShot(String userInput) {
        String result = "Miss";
        numOfTries++;
        int guess = Integer.parseInt(userInput);
        for (int k = 0; k < sheepLoc.length; k++) {
            if (guess == sheepLoc[k]) {
                numOfHits++;
                if (numOfHits == 3) {
                    result = "Sink";
                    isAlive = false;
                    break;
                } else {
                    result = "Hit";
                    break;
                }
            }
        }
        return result;
    }

    private int[] setSheep(int nose) {
        int[] sheepLocation = new int[3];
        for (int i = 0; i < sheepLocation.length; i++) {
            sheepLocation[i] = nose;
            nose++;
        }
        return sheepLocation;
    }
}
