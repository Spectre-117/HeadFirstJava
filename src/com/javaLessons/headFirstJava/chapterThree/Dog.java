package com.javaLessons.headFirstJava.chapterThree;

public class Dog {
    String name;

    public void bark() {
        System.out.println(name + " barks like Wof-wof");
    }

    public void eat() {
    }


    public void chasrCat() {
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        dogs[2] = dog1;

        dogs[0].name = "Steve";
        dogs[1].name = "Jack";

        System.out.println("Last dog's name is " + dogs[2].name);
        int x = 0;
        while (x < dogs.length) {
            dogs[x].bark();
            x++;
        }


    }


}
