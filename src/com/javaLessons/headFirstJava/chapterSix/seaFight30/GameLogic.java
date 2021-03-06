package com.javaLessons.headFirstJava.chapterSix.seaFight30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * <p>
 * The class {@code GameLogic} includes methods for
 * getting user input and locating sheep on the grid of 100 possible cells
 *
 * @author Serhii Lyalyuk
 * <p>
 */
public class GameLogic {
    private static final String alphabet = "abcdefghik";
    private int gridLength = 10;
    private int gridSize = 100;
    private int[] grid = new int[gridSize];
    private int sheepCount = 0;
    int startLoc = 0;

    /**
     * @param sheepSize number of sheep decks
     * @return the {@code ArrayList<String>} location of the sheep in symbolic form (Example "A5,B5,C5")
     */
    public ArrayList<String> setSheepOnBoard(int sheepSize) {
        ArrayList<String> loc = new ArrayList<>();  //sheep location on the grid of (0..99) cells
        int coords[] = new int[sheepSize];  //sheep coords
        int attempt = 0;        //num of tries to locate the sheep

        sheepCount++;
        // choose how the sheep will be located horizontal/vertical
        int increment = 1;
        if (sheepCount % 2 == 0) {
            increment = gridLength;
        }

        boolean sucsess = false;
        // main loop for getting coordinates for the sheep
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
        // transit sheep location from int coords out of array (0..99) into symbolic form (Ex. "A5..F8" )
        char z = 0;
        int row = 0;
        int column = 0;
        for (int y = 0; y < sheepSize; y++) {
            grid[coords[y]] = 1;
            row = coords[y] / gridLength;
            column = coords[y] % gridLength;
            z = alphabet.charAt(column);
            loc.add(z + Integer.toString(row));
            System.out.print(loc.get(y) + " ");
        }
        return loc;
    }

    /**
     * @return (@code String) user input from the console represented as String
     */
    public String userInput() {
        String userInput = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            userInput = br.readLine();
            if (userInput.length() == 0) {
                return null;
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return userInput;
    }

}
