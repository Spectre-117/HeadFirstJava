package com.javaLessons.headFirstJava.chapterSix.seaFight30;

import java.util.ArrayList;

public class Trial {
    private static final String alphabet = "abcdefghik";
    private int gridLength = 10;
    private int gridSize = 100;
    private int[] grid = new int[gridSize];
    private int sheepCount = 0;
    int startLoc = 0;

    public static void main(String[] args) {
        Trial tr = new Trial();
        ArrayList<String> resLoc = new ArrayList<>();
        resLoc = tr.setSheepOnBoard(3);
        System.out.println(resLoc);
    }

    public ArrayList<String> setSheepOnBoard(int sheepSize) {
        ArrayList<String> loc = new ArrayList<>();
        int coords[] = new int[sheepSize];
        int attempt = 0;

        sheepCount++;
        int increment = 1;
        if (sheepCount % 2 == 0) {
            increment = gridLength;
        }
        boolean sucsess = false;

        while (!sucsess && attempt++ < 200) {
            startLoc = (int) (Math.random() * gridSize);
            int sheepDeck = 0;
            sucsess = true;
            while (sucsess && sheepDeck < sheepSize) {
                if (grid[startLoc] == 0) {
                    coords[sheepDeck] = startLoc;
                    sheepDeck++;
                    startLoc += increment;
                    if (startLoc > gridSize) {
                        sucsess = false;
                    }
                    if (sheepDeck > 0 && startLoc % gridLength == 0) {
                        sucsess = false;
                    }
                } else {
                    sucsess = false;
                }
            }
        }
        char z = 0;
        int row = 0;
        int column = 0;
        for (int y = 0; y < sheepSize; y++) {
            grid[coords[y]]=1;
            row=coords[y]/gridLength;
            column=coords[y]%gridLength;
            z=alphabet.charAt(column);
            loc.add(z+Integer.toString(row));
        }
        return loc;
    }
}
