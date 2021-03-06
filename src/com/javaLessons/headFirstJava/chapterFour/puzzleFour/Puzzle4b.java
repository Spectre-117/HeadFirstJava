package com.javaLessons.headFirstJava.chapterFour.puzzleFour;

public class Puzzle4b {
    int ivar;
    public int doStuff(int factor){
       if (ivar >100){
           return ivar*factor;
       } else{
           return ivar*(6-factor); // ivar*(5-factor); - if x =6 in Puzzle4
       }
    }
}
