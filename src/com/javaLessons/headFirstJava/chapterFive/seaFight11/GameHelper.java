package com.javaLessons.headFirstJava.chapterFive.seaFight11;

public class GameHelper {
    private int[] sheepLoc = new int[3];
    private int numOfHits = 0;

    public String checkIfShot(String userInput) {
        String result = "Miss";
        int guess = Integer.parseInt(userInput);
        for (int k = 0; k < sheepLoc.length; k++) {
            if (guess == sheepLoc[k]) {
                numOfHits++;
                if (numOfHits == 3) {
                    result = "Sink";
                    break;
                } else {
                    result = "Hit";
                    break;
                }
            }
        }
        return result;
    }

    public void setSheep(int nose) {
        for (int i = 0; i < sheepLoc.length; i++) {
            sheepLoc[i] = nose;
            nose++;
        }
    }

}
