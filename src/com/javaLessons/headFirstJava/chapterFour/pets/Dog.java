package com.javaLessons.headFirstJava.chapterFour.pets;

public class Dog {
    private String name;
    private int weight;

    void bark(int weight, int numOfBarks) {
        while (numOfBarks > 0) {
            if (weight > 60) {
                System.out.println("Raf-raf");
            } else if (weight > 14) {
                System.out.println("Wof-Wof");
            } else {
                System.out.println("Tiaf-tiaf");
            }
            numOfBarks--;
        }
    }

    int showWeight() {
        return weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
