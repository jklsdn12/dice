package com.example.dice;


public class DigitObserver implements Observer {
    public void update(DiceGenerator generator) {
        System.out.println("DICE NUMBER:" + generator.getDiceVo().getDiceStr());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}