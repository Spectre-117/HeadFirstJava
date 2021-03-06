package com.javaLessons.headFirstJava.chapterTwo.guessGame;

public class GuessGame {

    public void gameStart() {
        System.out.println("Game started");
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Chosen number is " + targetNumber);
        while (true) {
            int p1Guess = p1.guessNum();
            System.out.println("Player 1 suppose it's " + p1Guess);
            int p2Guess = p2.guessNum();
            System.out.println("Player 2 suppose it's " + p2Guess);
            int p3Guess = p3.guessNum();
            System.out.println("Player 3 suppose it's " + p3Guess);
            if (p1Guess == targetNumber) {
                p1IsRight = true;
            }
            if (p2Guess == targetNumber) {
                p2IsRight = true;
            }
            if (p3Guess == targetNumber) {
                p3IsRight = true;
            }
            if (p1IsRight | p2IsRight | p3IsRight) {
                System.out.println("We've got a champion");
                if (p1IsRight) {
                    System.out.println("Player 1 won");
                }
                if (p2IsRight) {
                    System.out.println("Player 2 won");
                }
                if (p3IsRight) {
                    System.out.println("Player 3 won");
                }
                break;
            } else {
                System.out.println("Try one more time");
            }
        }
    }
}
