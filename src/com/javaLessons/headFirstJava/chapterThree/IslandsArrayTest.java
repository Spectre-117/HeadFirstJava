package com.javaLessons.headFirstJava.chapterThree;

public class IslandsArrayTest {
    public static void main(String[] args) {
        String [] islands = new String[4];
        islands[0]="Bermudas";
        islands[1]="Fiji";
        islands[2]="Azors";
        islands[3]="Cosumel";

        int[] index = new int[4];
        index[0]=1;
        index[1]=3;
        index[2]=0;
        index[3]=2;

        int y=0;
        int ref;
        while(y<4){
            ref=index[y];
            System.out.print("Islands = ");
            System.out.println(islands[ref]);
            y++;
        }
    }
}
