package com.javaLessons.headFirstJava.chapterOne;

public class FrazeGenerator {
    public static void main(String[] args) {

        String[] wordListOne = {"", ""};
        String[] wordListTwo = {"", ""};
        String[] wordListThree = {"", ""};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int indexOne = (int) (Math.random() * oneLength);
        int indexTwo = (int) (Math.random() * twoLength);
        int indexThree = (int) (Math.random() * threeLength);

        String phrase = wordListOne[indexOne] + " " + wordListTwo[indexTwo] + " " + wordListThree[indexThree];

        System.out.println("All you need is " + phrase);
    }

}
