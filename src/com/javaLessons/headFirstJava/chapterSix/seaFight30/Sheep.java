package com.javaLessons.headFirstJava.chapterSix.seaFight30;

import java.util.ArrayList;

public class Sheep {
    private ArrayList<String> sheepLoc;
    private String name;

    public String checkIfHit(String userInput) {
        String res = "Miss";
        int index = sheepLoc.indexOf(userInput);
        if (index >= 0) {
            sheepLoc.remove(index);
            if (sheepLoc.isEmpty()) {
                res = "Sink";
            } else {
                res = "Hit";
            }
        }
        return res;
    }

    public void setSheepLoc(ArrayList<String> loc) {
        sheepLoc = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
