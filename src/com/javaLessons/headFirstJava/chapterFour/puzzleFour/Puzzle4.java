package com.javaLessons.headFirstJava.chapterFour.puzzleFour;

public class Puzzle4 {
    public static void main(String[] args) {
        Puzzle4b[] obs = new Puzzle4b[7];
        int y = 1;
        int x = 0;
        int result = 0;
        while (x < 7) {
            obs[x] = new Puzzle4b();
            obs[x].ivar = y;
            y = y * 10;
            x = x + 1;
        }
        x = 7;
        while (x > 0) {
            x = x - 1;
            result = result + obs[x].doStuff(x);
        }
        System.out.println("Result " + result);
    }
}
