package com.javaLessons.headFirstJava.chapterFive.seaFight11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMain {
    private int numOfTries = 0;
    private boolean isAlive = true;

    public void gameStart() {
        GameHelper gh = new GameHelper();
        System.out.println("\"Sheep fight\"");
        System.out.println("Game start");
        int nose = (int) (Math.random() * 4);
        gh.setSheep(nose);
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        while (isAlive) {
            System.out.println("Please choose the cell");
            try {
                guess = sc.nextInt();
                if (guess == 10) {
                    System.out.println("Game finished");
                    break;
                }
                numOfTries++;
                Integer guess2 = guess;
                String guessString = guess2.toString();
                String result = gh.checkIfShot(guessString);
                if (result.equals("Sink")){
                    isAlive=false;
                }
                System.out.println(result);
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


}
