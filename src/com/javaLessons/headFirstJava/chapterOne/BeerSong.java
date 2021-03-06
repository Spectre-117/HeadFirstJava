package com.javaLessons.headFirstJava.chapterOne;

public class BeerSong {

    public static void main(String[] args) {

        String word = "Bottles";
        int numOfBottles = 99;

        while (numOfBottles > 0) {
            System.out.println(numOfBottles + " " + word + " of beer on the wall");
            System.out.println(numOfBottles + " " + word + " of beer");
            System.out.println("Take one, pass it around");
            numOfBottles--;
            if (numOfBottles == 1) {
                word = "Bottle";
            }
            if (numOfBottles > 0) {
                System.out.println(numOfBottles + " " + word + " of beer on the wall");
            }else{
                System.out.println("There're no Bottles of beer on the wall");
                System.out.println("Go shopping, buy some more!");
            }
        }

    }
}
