package com.javaLessons.headFirstJava.chapterSix.seaFight20;

import java.util.ArrayList;

public class GameHelper {
    private ArrayList<Integer> sheepLoc = new ArrayList<>();
    private int numOfHits = 0;

    public String checkIfShot(String userInput) {
        String result = "Miss";
        int guess = Integer.parseInt(userInput);
        int index = sheepLoc.indexOf(guess);
            if (index >= 0) {
                numOfHits++;
                sheepLoc.remove(index);
                if (sheepLoc.isEmpty()) {
                    result = "Sink";
                } else {
                    result = "Hit";
                }
            }
        return result;
    }

    public void setSheep(int nose) {
        for (int i = 0; i < 3; i++) {
            Integer nose2 = nose;
            sheepLoc.add(i,nose2);
            nose++;
        }
    }

}
