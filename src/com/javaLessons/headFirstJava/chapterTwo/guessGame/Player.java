package com.javaLessons.headFirstJava.chapterTwo.guessGame;

public class Player {
    private int guessNumber;

    public int guessNum() {
        guessNumber = (int) (Math.random() * 10);
        return guessNumber;
    }
}
