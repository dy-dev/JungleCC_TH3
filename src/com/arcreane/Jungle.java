package com.arcreane;

public class Jungle {

    public static void main(String[] args) {
        Ecosystem e = new Ecosystem();
        Weather w = new Weather();
        while(true){
            e.step();
            w.step();

            e.draw();

            try {
                Thread.sleep(250);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }

    }

}
