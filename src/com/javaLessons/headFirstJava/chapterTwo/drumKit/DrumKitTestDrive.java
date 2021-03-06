package com.javaLessons.headFirstJava.chapterTwo.drumKit;

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.PlayTopHat();
        d.snare=false;
        if(d.snare==true){
            d.playSnare();
        }
    }
}
