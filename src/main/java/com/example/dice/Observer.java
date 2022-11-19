package com.example.dice;


public interface Observer {
    public abstract void update(DiceGenerator generator) throws InterruptedException;
}
