package com.javaLessons.headFirstJava.chapterFour.pets;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setWeight(10);
        dog2.setWeight(75);
        dog3.setWeight(24);

        dog1.bark(dog1.getWeight(),2);
        dog2.bark(dog2.getWeight(),3);
        dog3.bark(dog3.getWeight(),1);
        System.out.println("Dog one weight is "+dog1.showWeight()+" kg");
    }
}
