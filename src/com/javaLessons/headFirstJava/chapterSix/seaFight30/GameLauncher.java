package com.javaLessons.headFirstJava.chapterSix.seaFight30;

import java.util.ArrayList;

public class GameLauncher {

    private GameLogic gl = new GameLogic();
    private ArrayList<Sheep> fleet = new ArrayList<>();
    private int numOfGuess;

    public void setUpGame() {
        Sheep one = new Sheep();
        one.setName("Bismark");
        Sheep two = new Sheep();
        two.setName("Nimitz");
        Sheep three = new Sheep();
        three.setName("Yamato");
        fleet.add(one);
        fleet.add(two);
        fleet.add(three);
        int i = 3;
        for (Sheep sp : fleet) {
            sp.setSheepLoc(gl.setSheepOnBoard(i));
        }
    }

    public void gameStart() {
        while (!fleet.isEmpty()) {
            String userIn = gl.userInput();
            checkUserGuess(userIn);
        }
        finishGame();
    }

    private void checkUserGuess(String userInput) {
        numOfGuess++;
        String res = "Miss";
        for (Sheep trialSheep : fleet) {
            res = trialSheep.checkIfHit(userInput);
            if (res.equals("Hit")) {
                break;
            }
            if (res.equals("Sink")) {
                System.out.println(trialSheep.getName() + " is sunk");
                fleet.remove(trialSheep);
                break;
            }
        }
        if (!res.equals("Sink")) {
            System.out.println(res);
        }
    }

    private void finishGame() {
        System.out.println(numOfGuess);
    }
}
