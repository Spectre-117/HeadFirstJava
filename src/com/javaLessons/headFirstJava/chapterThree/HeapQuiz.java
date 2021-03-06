package com.javaLessons.headFirstJava.chapterThree;

public class HeapQuiz {
    int id = 0;

    public static void main(String[] args) {
        int x = 0;
        HeapQuiz[] hq = new HeapQuiz[5];
        while (x < 3) {
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            x++;
        }
        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];
        for (int k = 0; k < hq.length; k++) {
            if (hq[k] != null) {
                System.out.println("hq[" + k + "].id = " + hq[k].id);
            } else {
                System.out.println("hq[" + k + "] = null");
            }
        }

    }
}
